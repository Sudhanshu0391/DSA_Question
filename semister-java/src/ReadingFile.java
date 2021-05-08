import java.io.*; 
import java.time.format.DateTimeFormatter;  
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
public class ReadingFile {
public static void main(String args[]) {
	 LocalDate now= LocalDate.now();
	 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	 try{
		 ObjectInputStream in =new ObjectInputStream(new FileInputStream("donor.txt"));
	     while (true) {
	         Donor d =(Donor)in.readObject();
	         if(d==null) {
	        	 break;
	         }
	         LocalDate lastDonate = LocalDate.parse(d.dateOfLastDonation, formatter);
	         long MonthDiff = ChronoUnit.MONTHS.between(lastDonate, now);
	         if(d.bloodGroup.equals("A+") && MonthDiff>=6)
	         	d.display();
	     }
	     in.close();
     }catch(Exception e) {}
}
}