package recurrsionSeries;

public class RevInt {

	public static void main(String[] args) {
		int n=-123;
		reverse((int)Math.abs(n));
		System.out.println(rev);
	}
	static int rev=0;
	private static void reverse(int n) {
		if(n<=0)
			return;
		int rem=n%10;
		rev=(rev*10)+rem;
		reverse(n/10);
	}

}
