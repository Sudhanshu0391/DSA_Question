import java.util.*;
class person{
	String name;
	int age;
	String gender;
	person(String name,int age,String gender)
	{
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
}
class student extends person{
	String RegNo;
	String dept;
	String CGPA;
	student(String name,int age,String gender,String Reg,String dept,String cgpa)
	{
		super(name,age,gender);
		this.RegNo = Reg;
		this.dept = dept;
		this.CGPA = cgpa;
	}
	
}
class Teacher extends person{
	String salary;
	String subject;
	Teacher(String name,int age,String gender,String salary,String subject)
	{
		super(name,age,gender);
		this.salary = salary;
		this.subject = subject;
	}
	void display()
	{
		System.out.println("*-------------------*");
		System.out.println("Name of Teacher: "+name);
		System.out.println("Age of Teacher: "+age);
		System.out.println("Gender of Teacher: "+gender);
		System.out.println("Salary of Teacher: "+salary);
		System.out.println("Subject which Teacher teaches: "+subject);
		System.out.println("*-------------------*");
	}
}
class collegeStudent extends student{
	String year;
	String major;
	collegeStudent(String name,int age,String gender,String Reg,String dept,String cgpa,String year,String major)
	{
		super(name,age,gender,Reg,dept,cgpa);
		this.year = year;
		this.major = major;
	}
	void display()
	{
		System.out.println("*-------------------*");
		System.out.println("Name of Student: "+name);
		System.out.println("Age of Student: "+age);
		System.out.println("Gender of Student: "+gender);
		System.out.println("Registration Number of Studente: "+RegNo);
		System.out.println("Department of Student: "+dept);
		System.out.println("CGPA of Student: "+CGPA);
		System.out.println("Year of Student: "+year);
		System.out.println("Major of Student: "+major);
		System.out.println("*-------------------*");
	}
	
}
public class inheritance {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Create Teacher Profile");
		System.out.println("Name of Teacher: ");
		String name = s.nextLine();
		System.out.println("Age of Teacher: ");
		int age = s.nextInt();
		System.out.println("Gender of Teacher: ");
		String gender = s.next();
		System.out.println("Salary of Teacher: ");
		String salary = s.next();
		System.out.println("Subject which Teacher teaches: ");
		String subject = s.next();
		person teacher = new Teacher(name,age,gender,salary,subject);
		System.out.println();
		System.out.println("Create Student Profile");
		System.out.println("Name of Student: ");
		String sname = s.next();
		System.out.println("Age of Student: ");
		int sage = s.nextInt();
		System.out.println("Gender of Student: ");
		String sgender = s.next();
		System.out.println("Registration Number of Studente: ");
		String reg = s.next();
		System.out.println("Department of Student: ");
		String dept = s.next();
		System.out.println("CGPA of Student: ");
		String cgpa = s.next();
		System.out.println("Year: ");
		String year = s.next();
		System.out.println("Major of Student: ");
		String major = s.next();
		student st = new collegeStudent(sname,sage,sgender,reg,dept,cgpa,year,major);
		((Teacher)teacher).display();
		
		((collegeStudent)st).display();
		
		

	}

}
