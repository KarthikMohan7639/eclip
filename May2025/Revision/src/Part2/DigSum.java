package Part2;

public class DigSum {

	public static void main(String[] args) {
		int n=12345;
		int res=digSum(n);
		System.out.println(res);
	}

	private static int digSum(int n) {
		int sum=0;
		while(n>0) {
			int dig=n%10;
			sum+=dig;
			n/=10;
		}
		return sum;
	}

}
