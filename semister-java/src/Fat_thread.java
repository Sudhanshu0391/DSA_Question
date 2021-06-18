import java.util.*;
class NumberOutofbound extends Exception{
int num1;
int num2;
NumberOutofbound(int r,int m){
num1=r;
num2=m;
}
public String toString() {
return "Invalid\nNumberOutofbound[1st Number:-"+num1+" 2nd Number:-"+num2+"]";
}
}

class sumOfFactor implements Runnable
{
    Thread t;
    int fn;
    int ln;
     
    sumOfFactor(int fn,int ln)
    {
        fn=fn;
        ln=ln;
        t=new Thread(this,"sumOfFactor Thread");
        System.out.println("\nSumOfFactor thread created : "+t);
        t.start();
    }
    public synchronized void run()  {
    	try
        {
    		if(fn<100 || ln>200) {
    			throw new NumberOutofbound(fn,ln);
    		}
    		 int n, sum = 0;
    	        Scanner s = new Scanner(System.in);
    	        for(int i=100;i<=200;i++)
    	        {
    	        	int j=i;
    	        	n=0;
    	        	sum=0;
    	        	while(j > 0)
        	        {
        	            n = j % 10;
        	            sum = sum + n;
        	            j = j / 10;
        	        }
    	        	if(i%sum==0)
    	        	{
    	        		System.out.println(i+" has Sum of digits is a factor of the same number");
    	        	}
        	        
    	        	
    	        }
    	        
        }
        catch (NumberOutofbound e)
        {
            System.out.println(e);
        }
        System.out.println("\nExiting "+t);
    }
}
class uniquePrime implements Runnable
{
    Thread t;
    int fn;
    int ln;
     
    uniquePrime(int fn,int ln)
    {
        fn=fn;
        ln=ln;
        t=new Thread(this,"Uniqueprime Thread");
        System.out.println("\nUniqueprime thread created : "+t);
        t.start();
    }
     
    public synchronized void run()
    {
        try
        {
            for(int i=10;i<100;i++) {
            	int ans = (int)(i%10 + i/10);
            	boolean flag = false;
                for (int j = 2; j <= ans / 2; ++j) {
                  // condition for nonprime number
                  if (ans % j == 0) {
                    flag = true;
                    break;
                  }
                }

                if (!flag)
                  System.out.println(i + " is a number whose digits sum are prime.");
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("\nExiting "+t);
    }
}

public class Fat_thread {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
	  	System.out.println("Enter the first number");
	  	int fn = s.nextInt();
	  	System.out.println("Enter the last number");
	  	int ln = s.nextInt();
	  	sumOfFactor th = new sumOfFactor(100,200);
	  	uniquePrime th1 = new uniquePrime(fn,ln);
	     try
	     {
	         th.t.join();
	         th1.t.join();
	         
	     }
	     catch (Exception ex)
	     {
	          ex.printStackTrace();
	     }
	     System.out.println("Exiting main thread");

}
}
