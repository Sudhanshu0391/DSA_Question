import java.util.*;
import java.io.*;
class Fibonacci implements Runnable
{
	Thread t;
    int n;
     
    Fibonacci(int x)
    {
        n = x;
        t=new Thread(this,"Fibonacci Thread");
        System.out.println("\nFibonacci thread created : "+t);
        t.start();
    }
     public void run()
     {
          try
          {
               int a=0, b=1, c=0;
               System.out.println("Fibonacci series:");
               while (n>0)
               {
                    System.out.print(c+" ");
                    a=b;
                    b=c;
                    c=a+b;
                    n=n-1;
               }
          }
          catch (Exception ex)
          {
               ex.printStackTrace();
          }
     }
}
class Factorial implements Runnable
{
    Thread t;
    int n;
     
    Factorial(int x)
    {
        n = x;
        t=new Thread(this,"Factorial Thread");
        System.out.println("\nFactorial thread created : "+t);
        t.start();
    }
     
    public void run()
    {
        try
        {
            long f = 1;
            for(int i = 2;i<=n;i++)
            {
                f*=i;
            }
            System.out.print("Factorial of "+n+" is : "+f);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("\nExiting "+t);
    }
}
public class thread1 {
	public static void main(String[] args)
    {
		Scanner s = new Scanner(System.in);
  	  	System.out.println("Enter the Limit of fibonacci series:");
  	  	int fi = s.nextInt();
  	  	System.out.println("Enter the number n:");
  	  	int n = s.nextInt();
        Fibonacci fib = new Fibonacci(fi);
        Factorial fact = new Factorial(n);
         try
         {
             fact.t.join();
             fib.t.join();
             
         }
         catch (Exception ex)
         {
              ex.printStackTrace();
         }
         System.out.println("Exiting main thread");
    }

}
