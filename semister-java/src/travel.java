import java.util.*;
class sudhtravels
{
	private int amount;
	private int distance;
	private int totalamount;
	public sudhtravels(int amount,int distance) {
		this.amount = amount;
		this.distance = distance;
	}
	
	public void calculate(boolean bool)
	{
		if(bool)
		{
			totalamount = (int)((amount*distance)-(amount*distance)*0.1);
		}
		else
		{
			totalamount = amount*distance;
		}
	}
	
	public int getter()
	{
		return totalamount;
	}
}

class passenger
{
	private String name;
	private String mobile_number;
	private String vehicle;
	public passenger(String name,String mobile_number,String vehicle)
	{
		this.name = name;
		this.mobile_number = mobile_number;
		this.vehicle = vehicle;
	}
	void print()
	{
		System.out.println("Details of Passenger");
		System.out.println("*-----------*");
		System.out.println("Name of Passenger: "+name);
		System.out.println("Mobile Number of Passenger: "+mobile_number);
		System.out.println("We are carrying our own vehicle for trip: "+vehicle);
		System.out.println("*------------*");
	}
}


public class travel 
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name of Passenger");
		String name = s.next();
		System.out.println("Enter the mobile number of Passenger");
		String mobile = s.next();
		System.out.println("Are you carrying your own vehicle");
		String bool = s.next();
		passenger p = new passenger(name,mobile,bool);
		System.out.println("The amount set by travel agency for 1 km distance");
		int amount = s.nextInt();
		System.out.println("The distance covered by Passenger during the trip");
		int distance = s.nextInt();
		sudhtravels sudh = new sudhtravels(amount,distance);
		p.print();
		if(bool.equals("yes"))
		{
			sudh.calculate(true);
		}
		else
		{
			sudh.calculate(false);
		}
		System.out.println("Total amount for the Traveling is: Rs"+sudh.getter());
		
	}
}
