import java.util.*;

import primespackage.*;
public class TwinPrimes {

	public static void main(String[] args) {
		Primes p=new Primes();
		int start;
		int end;
		int flag=0;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter starting number:-");
		start=s.nextInt();
		System.out.print("Enter End number:-");
		end=s.nextInt();
		int arr[]=new int[end-start];
		int count=0;
		for(int i=start;i<=end;i++) {
			if(p.checkForPrime(i)==1) {
				arr[count++]=i;
			}
		}
		System.out.print("All possible twin within range "+start+" to "+end+" whose diffrence is 2 are:-");
		if(count>2) {
			for(int i=0;i<count-1;i++) {
				if(arr[i+1]-arr[i]==2) {
					System.out.print("("+arr[i]+","+arr[i+1]+") ");
					flag=1;
				}
				else if(arr[i+1]-arr[i]==1 && i<=count-3)
					if(arr[i+2]-arr[i]==2) {
						System.out.print("("+arr[i]+","+arr[i+2]+") ");
						flag=1;
					}
			}
		}
		if(flag==0) {
			System.out.print("No such pairs available");
		}

	}

}
