package recurrsionSeries;

public class DigSum {

	public static void main(String[] args) {
		int n=1234;
		int ans=digSum(n);
		System.out.println(ans);
	}

	private static int digSum(int n) {
		if(n<1)
		return 0;
		
		return (n%10)+digSum(n/10);
	}

}
