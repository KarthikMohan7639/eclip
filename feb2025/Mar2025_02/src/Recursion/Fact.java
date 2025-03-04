package Recursion;

public class Fact {

	public static void main(String[] args) {
		int n=5;
		int a=fact(n);
		System.out.println(a);

	}

	private static int fact(int n) {
		if(n==0||n==1) {
			return 1;
		}
		return n*fact(n-1);
	}
	

}
