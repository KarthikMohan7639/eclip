package iter;

public class DigSum {

	public static void main(String[] args) {
		int n=1234;
		int  res=digSum(n);
		System.out.println(res);
	}

	private static int digSum(int n) {
		int sum=0;
		while(n>0) {
			int dig=n%10;//3 
			sum+=dig;//0+2=2
			n/=10;//12
		}
		return sum;
	}

}
