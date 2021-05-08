import java.io.*;
public class Donor implements Serializable  {
	String name;
	int age;
	String address;
	String contactNumber;
	String bloodGroup;
	String dateOfLastDonation;
	Donor(String n,int a,String add,String mobile,String bloodG,String date){
		name=n;
		age=a;
		address=add;
		contactNumber=mobile;
		bloodGroup=bloodG;
		dateOfLastDonation=date;
	}
	public void display() {
		System.out.println("\nName:-"+name);
		System.out.println("Age:-"+age);
		System.out.println("Address:-"+address);
		System.out.println("Mobile:-"+contactNumber);
		System.out.println("Blood Group:-"+bloodGroup);
		System.out.println("Date of last donation:-"+dateOfLastDonation);
	}
}
