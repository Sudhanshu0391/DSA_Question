import java.util.*;

import javax.swing.plaf.synth.SynthScrollBarUI;
class doctor{
	int id;
	String name;
	float experiance;
	String curr_shift;
	public doctor(int id,String name,float experiance,String curr_shift){
		this.name=name;
		this.id=id;
		this.experiance=experiance;
		this.curr_shift=curr_shift;
	}
	void display()
	{
		System.out.println("Details of Doctor");
		System.out.println("*.................*");
		System.out.println("Name of Doctor: "+name);
		System.out.println("Id of Doctor: "+id);
		System.out.println("Experiance of Doctor: "+experiance);
		System.out.println("Current Shift of Doctor: "+curr_shift);
		System.out.println("*.................*");

	}
}
class department extends doctor{
	public department(int id,String name,float experiance,String curr_shift)
	{
		super(id,name,experiance,curr_shift);
	}
	void Paediatric()
	{
		System.out.println("Department Name: Paediatric");
		System.out.println("Appointment Date: 19th March");
		System.out.println("Appointment Time: Evening");
	}
	void ENT()
	{
		System.out.println("Department Name: ENT");
		System.out.println("Appointment Date: 18th March");
		System.out.println("Appointment Time: Morning");
	}
	void Dermatology()
	{
		System.out.println("Department Name: Dermatology");
		System.out.println("Appointment Date: 17th March");
		System.out.println("Appointment Time: Evening");
	}
}
class patients{
	String name;
	String patient_id;
	String email;
	String mobile_number;
	public patients(String name,String id,String email,String mobile_number){
		this.name=name;
		this.patient_id=id;
		this.email=email;
		this.mobile_number=mobile_number;
	}
	
	void display()
	{
		System.out.println("Details of Patient");
		System.out.println("*.................*");
		System.out.println("Name of Patient: "+name);
		System.out.println("Id of Patient: "+patient_id);
		System.out.println("Email of Patient: "+email);
		System.out.println("Mobile Number of Patient: "+mobile_number);
		System.out.println("*.................*");
	}
}
public class treatment {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Name of Patient");
		String name = s.nextLine();
		System.out.println("Enter id of Patient");
		String id = s.nextLine();
		System.out.println("Enter Email of Patient");
		String email = s.nextLine();
		System.out.println("Enter Mobile Number of Patient");
		String mobile = s.nextLine();
		
		System.out.println();
		
		System.out.println("Enter Name of Doctor");
		String dname = s.nextLine();
		System.out.println("Enter id of Doctor");
		int did = s.nextInt();
		System.out.println("Enter Experiance of Doctor");
		float dexp = s.nextFloat();
		System.out.println("Enter Shift of Doctor");
		String dshift = s.next();
		
		patients pt = new patients(name,id,email,mobile);
		doctor dc = new department(did,dname,dexp,dshift);
		System.out.println();
		System.out.println("Please Specify the Deparment for treatment");
		String str = s.next();
		System.out.println();
		pt.display();
		System.out.println();
		dc.display();
		System.out.println();
		if(str.equals("Paediatric"))
		{
			((department)dc).Paediatric();
		}
		else if(str.equals("ENT"))
		{
			((department)dc).ENT();
		}
		else
		{
			((department)dc).Dermatology();
		}
		

	}

}
