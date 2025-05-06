package Recurrsion;

public class PrimeRecurrsion {

	public static void main(String[] args) {
		int n=17;
		boolean res=isPrimeRec(n,1);
		System.out.println(res);
	}

	private static boolean isPrimeRec(int n,int divisor) {
		if(n<2) {
			return false;
		}
		if(divisor==1)
			return true;
		if(n%divisor==0) {
			return true;
		}
		return isPrimeRec(n, divisor-1);
	}

}
