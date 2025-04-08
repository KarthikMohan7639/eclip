package part3;

public class StrongNum {
	/*
	 * A strong number in java is known as sum of its factorial is equal to the original number
	 * i/p:145
	 * o/p:strong number
	 * explanation:
	 * 1!+4!+5!=1+24+120 -> 145
	 */
	public static void main(String[] args) {
		int n=145;
		int m=factorial(n);
		boolean res=strongNo(n);
		System.out.println(res);
	}

	private static boolean strongNo(int num) {
		int originalNum=num;
		int sum=0;
		while(num>0) {
			int dig=num%10;
			sum+=factorial(dig);
			num/=10;
		}
		return sum==originalNum;
	}

	private static int factorial(int n) {
		if(n==0||n==1) {
			return 1;
		}
		int fact=1;
		for(int i=2;i<=n;i++) {
			fact*=i;
		}
		return fact;
	}

}
