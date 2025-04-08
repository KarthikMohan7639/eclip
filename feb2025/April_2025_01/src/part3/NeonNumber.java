package part3;

public class NeonNumber {
	/*NEON NUMBER
	 * ==========
	 * A Neon Number is a number where the sum of the digits of its square equals the original number.
	 * for example:
	 * i/p:9
	 * o/p:true
	 * explanation:
	 * 9*9=81
	 * 8+1=9
	 * 9=9
	 */
	
	
	public static void main(String[] args) {
		int n=8;
		boolean res=isNeonNum(n);
		System.out.println(res);
	}

	private static boolean isNeonNum(int n) {
		int sq=n*n;
		int sum=0;
		while(sq>0) {
			int dig=sq%10;
			sum+=dig;
			sq/=10;
		}
		return sum==n;
	}

}
