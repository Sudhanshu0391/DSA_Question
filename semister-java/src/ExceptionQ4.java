import java.util.*;
class InvalidEmployeeCode extends Exception{
	String EmpID;
	InvalidEmployeeCode(String e){
		EmpID=e;
	}
	public String toString() {
		return "InvalidEmployeeCode["+EmpID+"]";
	}
}
class Empployee{
	String name;
	String id;
	String dob;
	Empployee(String name,String id,String dob){
		this.name = name;
		this.id = id;
		this.dob = dob;
	}
	void display() {
		System.out.println("Details of Employee");
		System.out.println("*---------------*");
		System.out.println("Name of Employee: "+name);
		System.out.println("ID of Employee: "+id);
		System.out.println("DOB of Employee: "+dob);
		System.out.println("*---------------*");
	}
}
public class ExceptionQ4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name of employee:-");
		String name=sc.nextLine();
		System.out.print("Enter ID of employee:-");
		String EmpID=sc.next();
		System.out.print("Enter DOB of employee:-");
		String DOB=sc.next();
		try {
			if(!EmpID.matches("[0-9]{2}[-][FS][-][0-9]{3}")) {
				throw new InvalidEmployeeCode(EmpID);
			}
			else {
				Empployee emp=new Empployee(name,EmpID,DOB);
				System.out.println();
				emp.display();
			}
		}catch(InvalidEmployeeCode e) 
		{
			System.out.println(e);
		}	

	}

}
