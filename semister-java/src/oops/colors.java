package oops;
import java.util.*;
public class colors {
	public static int mix_color(int color1,int color2,int color3) {
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
	    return mixA << 24 | mixR << 16 | mixG << 8 | mixB;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter color1 in Hexadecimal:-");
		int color1=Integer.decode(sc.next());
		System.out.print("Enter color2 in Hexadecimal:-");
		int color2=Integer.decode(sc.next());
		System.out.print("Enter color3 in Hexadecimal:-");
		int color3=Integer.decode(sc.next());
		System.out.println("Combination of 0x"+Integer.toHexString(color1)+" 0x"+Integer.toHexString(color2)+" 0x"+Integer.toHexString(color3)+" is 0x"+Integer.toHexString(mix_color(color1, color2, color3)));
		sc.close();
		
	}

	

	
}
