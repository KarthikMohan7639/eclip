package part3;

public class FibIterative {

	public static void main(String[] args) {
		fib(10);
		
	}
	
	static void fib(int n) {
		int n1=0,n2=1;
		
		for(int i=0;i<n;i++) {
			int n3=n2+n1;
			n1=n2;
			n2=n3;
		}
		System.out.println(n1);
		
	}

}
