import java.util.*;
import java.io.*;
public class Q1 {	 
    public static void main(String args[]) {
    	int number;
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter number of donor:-");
    	number=sc.nextInt();
    	Donor arr[] = new Donor[number];
    	for(int i=0;i<number;i++) {
    		System.out.println("*-----------------*");
    		System.out.print("Enter name of "+(i+1)+" donor:-");
    		String name=sc.next();
    		System.out.print("Enter age of "+(i+1)+" donor:-");
    		int age=sc.nextInt();
    		System.out.print("Enter address of "+(i+1)+" donor:-");
    		String address=sc.next();
    		System.out.print("Enter Contact Number of "+(i+1)+" donor:-");
    		String contactNumber=sc.next();
    		System.out.print("Enter Blood Group of "+(i+1)+" donor:-");
    		String bloodGroup=sc.next();
    		System.out.print("Enter Date of Last Donation of "+(i+1)+" donor:-");
    		String dateOfLastDonation=sc.next();
    		Donor d=new Donor(name,age,address,contactNumber,bloodGroup,dateOfLastDonation);
    		arr[i]=d;
    		System.out.println("*-----------------*");
    		System.out.println();
    	}
    		try {
        		FileOutputStream fout=new FileOutputStream("donor.txt",true);
        		ObjectOutputStream out=new ObjectOutputStream(fout);
        		for(int i=0;i<number;i++) {
        			out.writeObject(arr[i]);
        		}
        		out.close();
        	}catch(Exception e) {System.out.println(e);}
    		

    }
}