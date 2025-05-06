package iter;

public class Fact {
	public static void main(String[] args) {
		int n=5;
		int res=fact(n);
		System.out.println(res);
	}

	private static int fact(int n) {
		int prod=1;
		for(int i=1;i<=n;i++) {
			 prod*=i;
		}
		return prod;
	}
}
