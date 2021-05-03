package primespackage;

public class Primes {
	public int checkForPrime(int n) {
		if(n>1) {
			for(int i=n-1;i>1;i--) {
				if(n%i==0)
					return 0;
			}
			return 1;
		}
		else
			return 0;
		}
	}
