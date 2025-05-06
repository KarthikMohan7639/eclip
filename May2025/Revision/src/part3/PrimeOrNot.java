package part3;

public class PrimeOrNot {

	public static void main(String[] args) {
		isPrime(16);
		System.out.println(isPrime(18));
		
	}

	private static boolean isPrime(int n) {
		boolean ans=false;
		if(n<2) {
			ans=true;
		}
		for(int i=2;i<n;i++) {
			if(n%i!=0) {
				ans=true;
				break;
			}
			else {
				ans=false;
				break;
			}
		}
		return ans;
	}

}
