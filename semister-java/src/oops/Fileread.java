package oops;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner;
public class Fileread {

	public static void main(String[] args) {
		try {
		      File myObj = new File("mix_color.txt");
		      Scanner myReader = new Scanner(myObj);
		      int i = 1;
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        System.out.println("Color combination of "+i+" input is "+"0x"+data);
		        i++;
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }

	}

}
