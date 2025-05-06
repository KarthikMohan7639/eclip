package recurrsionSeries;

public class DigProd {
	public static void main(String[] args) {
		int n=123;
		int res=digProd(n);
		System.out.println(res);
	}

	private static int digProd(int n) {
		if(n%10==n)
			return n;
		return (n%10)*digProd(n/10);
	}

}
