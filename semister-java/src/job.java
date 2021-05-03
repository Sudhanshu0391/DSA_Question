import java.util.*;
class employee{
	String name;
	String id;
	String email;
	String mobile_number;
	int salary;
	String performance_review;
	int evaluation_pts;
	public employee(String name,String id,String email,String mobile_number,int salary,String performance_review,int evaluation_pts){
		this.name=name;
		this.id=id;
		this.email=email;
		this.mobile_number=mobile_number;
		this.salary=salary;
		this.performance_review=performance_review;
		this.evaluation_pts=evaluation_pts;
	}
	
	void display()
	{
		
		System.out.println("Name of Employee: "+name);
		System.out.println("Id of Employee: "+id);
		System.out.println("Email of Employee: "+email);
		System.out.println("Mobile Number of Employee: "+mobile_number);
		System.out.println("Salary of Employee: "+salary);
		System.out.println("Performance_review of Employee: "+performance_review);
		System.out.println("Evaluation_Points of Employee: "+evaluation_pts);
	}
	void updated_salary()
	{
		int sal = this.salary;
		sal+=(sal*15)/100;
		System.out.println("Updated Salary "+sal);
		
	}
	void updated_evaluation()
	{
		int eva = this.evaluation_pts;
		eva+=10;
		System.out.println("Updated Evaluation_Pts "+eva);
	}
}
class Manager extends employee{
	private String Roll_Type;
	public Manager(String name,String id,String email,String mobile_number,int salary,String performance_review,int evaluation_pts,String Roll_Type)
	{
		super(name,id,email,mobile_number,salary,performance_review,evaluation_pts);
		this.Roll_Type=Roll_Type;
	}
	void display()
	{
		System.out.println("Details of Employee");
		System.out.println("*---------------*");
		System.out.println("Roll_type of Employee: "+Roll_Type);
		super.display();
		System.out.println("*---------------*");
	}
}
class Team_lead extends employee{
	private String Roll_Type;
	public Team_lead(String name,String id,String email,String mobile_number,int salary,String performance_review,int evaluation_pts,String Roll_Type)
	{
		super(name,id,email,mobile_number,salary,performance_review,evaluation_pts);
		this.Roll_Type=Roll_Type;
	}
	void display()
	{
		System.out.println("Details of Employee");
		System.out.println("*---------------*");
		System.out.println("Roll_type of Employee: "+Roll_Type);
		super.display();
		System.out.println("*---------------*");
	}
}
class Developer extends employee{
	private String Roll_Type;
	public Developer(String name,String id,String email,String mobile_number,int salary,String performance_review,int evaluation_pts,String Roll_Type)
	{
		super(name,id,email,mobile_number,salary,performance_review,evaluation_pts);
		this.Roll_Type=Roll_Type;
	}
	void display()
	{
		System.out.println("Details of Employee");
		System.out.println("*---------------*");
		System.out.println("Roll_type of Employee: "+Roll_Type);
		super.display();
		System.out.println("*---------------*");
	}
}
class Traniee extends employee{
	private String Roll_Type;
	public Traniee(String name,String id,String email,String mobile_number,int salary,String performance_review,int evaluation_pts,String Roll_Type)
	{
		super(name,id,email,mobile_number,salary,performance_review,evaluation_pts);
		this.Roll_Type=Roll_Type;
	}
	void display()
	{
		System.out.println("Details of Employee");
		System.out.println("*---------------*");
		System.out.println("Roll_type of Employee: "+Roll_Type);
		super.display();
		System.out.println("*---------------*");
	}
}
public class job {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = s.nextLine();
		System.out.println("Enter Roll_Type");
		String roll = s.nextLine();
		System.out.println("Enter id");
		String id = s.nextLine();
		System.out.println("Enter Email");
		String email = s.nextLine();
		System.out.println("Enter Mobile Number");
		String mobile = s.nextLine();
		System.out.println("Enter Salary");
		int salary = s.nextInt();
		System.out.println("Enter Performance_Review");
		String perf = s.next();
		System.out.println("Enter Evaluation_Pt");
		int eval = s.nextInt();
		
		employee obj;
		if(roll.equals("Manager"))
		{
			obj = new Manager(name,id,email,mobile,salary,perf,eval,roll);
		}
		else if(roll.equals("Team_lead"))
		{
			obj = new Team_lead(name,id,email,mobile,salary,perf,eval,roll);
		}
		else if(roll.equals("Developer"))
		{
			obj = new Developer(name,id,email,mobile,salary,perf,eval,roll);
		}
		else
		{
			obj = new Traniee(name,id,email,mobile,salary,perf,eval,roll);
		}
		obj.display();
		if(perf.equals("Good"))
		{
			System.out.println("Your Performance Review is good.So you are Eligiable");
			obj.updated_evaluation();
			obj.updated_salary();
		}
		else
		{
			System.out.println("Performance Review is bad.So you are not Eligiable");
			System.out.println("Exsisting Salary "+salary);
			System.out.println("Exsisting Evaluation_Pt "+eval);
		}

	}

}
