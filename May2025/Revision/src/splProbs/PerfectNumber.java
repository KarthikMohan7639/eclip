package splProbs;

public class PerfectNumber {
	/*
	 * Perfect number
	 * =============
	 * A perfect number is a +ve integer that is equal to the sum of its proper divisors 
	 * excluding itself
	 * 
	 * i/p=6
	 * o/p=true
	 * 
	 * explanation
	 * factors of 6 are 1,2,3,6 excluding 6 (1+2+3=6) so true
	 *
	 */

	public static void main(String[] args) {
		int num=6;
		boolean res=isPerfectNum(num);
		System.out.println(res);
		
//		for(int j=1;j<300;j++) {
//			if(isPerfectNum(j)==true) {
//				System.out.println(j);
//			}
//		}
	}

	private static boolean isPerfectNum(int num) {
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		return sum==num;
	}

}
