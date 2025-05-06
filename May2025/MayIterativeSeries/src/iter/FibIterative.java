package iter;

public class FibIterative {

	public static void main(String[] args) {
		int N=10;
		fib(N);
	}
	
	static void fib(int N) {
		int n1=0;
		int n2=1;
		
		for(int i=0;i<N;i++) {
			System.out.print(n1+" ");
			
			int n3=n2+n1;
			//swap
			n1=n2;
			n2=n3;
		}
	}

}
