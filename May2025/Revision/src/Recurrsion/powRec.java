package Recurrsion;

public class powRec {

	public static void main(String[] args) {
		double base=5;
		double exp=2;
//		System.out.println(Math.pow(n,pow));
		double ans=powRec(base,exp);
		System.out.println(ans);
	}

	private static double powRec(double base, double exp) {
		if(exp==0)
			return 1;
		else if(exp<0) {
			return 1/powRec(base, -exp);
		}
		else {
			return base*powRec(base, exp-1);
		}
	}

}
