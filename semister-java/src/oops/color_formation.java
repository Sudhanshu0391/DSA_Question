package oops;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;  // Import the File class
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class color_formation extends colors{
	public int mix_color(int color1,int color2,int color3) {
		int color1A = (color1 >> 24 & 0xff);
	    int color1R = ((color1 & 0xff0000) >> 16);
	    int color1G = ((color1 & 0xff00) >> 8);
	    int color1B = (color1 & 0xff);
	    int color2A = (color2 >> 24 & 0xff);
	    int color2R = ((color2 & 0xff0000) >> 16);
	    int color2G = ((color2 & 0xff00) >> 8);
	    int color2B = (color2 & 0xff);
	    int color3A = (color3 >> 24 & 0xff);
	    int color3R = ((color3 & 0xff0000) >> 16);
	    int color3G = ((color3 & 0xff00) >> 8);
	    int color3B = (color3 & 0xff);
	    
	    int mixA=(int)((color1A+color2A+color3A)/3);
	    int mixR=(int)((color1R+color2R+color3R)/3);
	    int mixG=(int)((color1G+color2G+color3G)/3);
	    int mixB=(int)((color1B+color2B+color3B)/3);
	  //  System.out.println(mixA+" "+mixR+" "+mixG+" "+mixB);
	    if(mixA<256 && mixR<256 && mixG<256 && mixB<256) {
	    	return mixA << 24 | mixR << 16 | mixG << 8 | mixB;
	    }
	    else {
	    	return -1;
	    }
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean ans = true;
		int i = 1;
		color_formation obj = new color_formation();
		String fileName = "mix_color.txt";
		File f = new File(fileName);
		int count=0;
		try {
			if(!f.exists()) {
				BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
				System.out.println("Enter inputs for three colors");
				System.out.print("Enter color1 in Hexadecimal:-");
				int color1=Integer.decode(sc.next());
				System.out.print("Enter color2 in Hexadecimal:-");
				int color2=Integer.decode(sc.next());
				System.out.print("Enter color3 in Hexadecimal:-");
				int color3=Integer.decode(sc.next());
				out.write(Integer.toHexString(obj.mix_color(color1, color2, color3))+"\n");
	    		out.close();
			}
			else {
				BufferedReader in = new BufferedReader(new FileReader(fileName)); // checking if value already present in file or not..
				System.out.println("Enter inputs for three colors");
				System.out.print("Enter color1 in Hexadecimal:-");
				int color1=Integer.decode(sc.next());
				System.out.print("Enter color2 in Hexadecimal:-");
				int color2=Integer.decode(sc.next());
				System.out.print("Enter color3 in Hexadecimal:-");
				int color3=Integer.decode(sc.next());
				String str = Integer.toHexString(obj.mix_color(color1, color2, color3));
				String mystring;
				while ((mystring = in.readLine()) != null) {
					if(str.equals(mystring)) {
						System.out.println("Value already present in file...");
						count++;
					}
				}
				if(count==0) {
					BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));
					out.write(str+"\n");
		    		out.close();
				}
				
			}
				
			
    	}
		catch(Exception e) 
		{
    		System.out.println(e);
    	}
		
	}

}
