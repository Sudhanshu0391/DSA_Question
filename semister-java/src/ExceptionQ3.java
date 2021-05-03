import java.util.*;
class IllegalArgumentException extends Exception{
	String reg;
	String mob;
	IllegalArgumentException(String r,String m){
		reg=r;
		mob=m;
	}
	public String toString() {
		return "Invalid\nIllegalArgumentException[RegNo:-"+reg+" Mobile:-"+mob+"]";
	}
}
class NumberFormatException extends Exception{
	String mob;
	NumberFormatException(String m){
		mob=m;
	}
	public String toString() {
		return "Invalid\nNumberFormatException[Mobile:-"+mob+"]";
	}
}
class NoSuchElementException extends Exception{
	String reg;
	NoSuchElementException(String r){
		reg=r;
	}
	public String toString() {
		return "Invalid\nNoSuchElementException[RegNo:-"+reg+"]";
	}
}
public class ExceptionQ3 {

	public static void main(String[] args) {
		String regNo;
		String mobile;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Register No:-");
		regNo=sc.next();
		System.out.print("Enter Mobile No:-");
		mobile=sc.next();
		try {
			if(regNo.length()!=9 || mobile.length()!=10)
				throw new IllegalArgumentException(regNo,mobile);
			else if(!mobile.matches("[0-9]+")) {
				throw new NumberFormatException(mobile);
			}
			else if(!regNo.matches("[A-Za-z0-9]+")) {
				throw new NoSuchElementException(regNo);
			}
			else
				System.out.println("Arguments are valid");
		}catch(IllegalArgumentException e) 
		{
			System.out.println(e);
		}
		catch(NumberFormatException e) 
		{
			System.out.println(e);
		}
		catch(NoSuchElementException e) 
		{
			System.out.println(e);
		}

	}

}
