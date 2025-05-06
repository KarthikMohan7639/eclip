package iter;

public class DigProd {
	public static void main(String[] args) {
		int n=505;
		System.out.println(digProd(n));
	}

	private static int digProd(int n) {
		
		int prod=1;
		while(n>0) {
			int dig=n%10;
			prod*=dig;
			n/=10;
		}
		return prod;
	}
}
