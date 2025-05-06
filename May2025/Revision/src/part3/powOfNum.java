package part3;

public class powOfNum {

	public static void main(String[] args) {
		double base=5;
		double exp=3;
//		System.out.println(Math.pow(n,pow));
		double ans=pow(base,exp);
		System.out.println(ans);
	}

	private static double pow(double base, double exp) {
		int res=1;
		for(int i=0;i<Math.abs(exp);i++) {
			res*=base;
		}
		if(exp<0)
			return 1/res;
		return res;
	}

}
