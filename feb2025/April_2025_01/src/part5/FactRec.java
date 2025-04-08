package part5;

public class FactRec {
	/*
	 * Factorial
	 * =========
	 * n!=1*2*3*4.....n-1
	 */
	public static void main(String[] args) {
		int num=10;
		long res=factRec(num);
		System.out.println(num+"!"+" = "+res);
		int pro=1;
	}
	
	private static int factRec(int num) {
		if(num<=0) {
			return 1;
		}
		else {
			return num*factRec(num-1);//10/
		}
	}
}
