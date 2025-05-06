package splProbs;

public class ArmstrongNum {
	/*
	 * ARMSTRONG NUMBER
	 * ===============
	 * i/p=153
	 * o/p=true
	 * exp:
	 *  3  3  3
	 * 1 +5 +3 =1+125+27=153
	 */
	
	public static void main(String[] args) {
		int n =153;
		boolean ans=isArmStrong(n);
		System.out.println(ans);
	}

	private static boolean isArmStrong(int n) {
		int num=Math.abs(n);
		int sum=0;
		int digcnt=String.valueOf(num).length();
		
		while((int)Math.abs(n)>0) {
			int dig=n%10;
			sum+=Math.pow(dig,digcnt);
			n/=10;
		}
		return num==sum;
	}
}
