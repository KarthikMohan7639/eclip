package splProbs;

public class NeonNum {
	/*
	 * neon num
	 * ========
	 * it is number in while the sq of a number and after that its dig sum is equal to original number
	 * 
	 * i/p:9
	 * o/p:true
	 * exp
	 * ---
	 * 9*9=81=>8+1->9
	 */

	public static void main(String[] args) {
		int n=11;
		System.out.println(isNeonNum(n));
	}
	static boolean isNeonNum(int n) {
		int num=n;
		int sum=0;
		int sq=num*num;
		while(sq>0) {
			int dig=sq%10;
			sum+=dig;
			sq/=10;
		}
		return sum==n;
	}

}
