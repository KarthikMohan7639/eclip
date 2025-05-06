package part3;

public class FibSeriesIter {

	public static void main(String[] args) {
		int n=10;
		fib(n);
	}
	static void fib(int n) {
		int n1=0;
		int n2=1;
		for(int i=0;i<=n;i++) {
			System.out.print(n1+" ");
			int n3=n1+n2;
			
			//swap
			n1=n2;
			n2=n3;
		}
	}

}
