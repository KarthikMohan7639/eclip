package recurrsionSeries;

public class FibSeq {

	public static void main(String[] args) {
		int N=10;
		for(int i=0;i<N;i++) {
			System.out.print(fib(i)+" ");
		}
	}

	private static int fib(int n) {
		if(n<=1) {
			return n;
		}
		return fib(n-1)+fib(n-2);
	}

}
