package splProbs;

public class spyNum {
	/*
	 * SPY NUMBER
	 * ----------
	 * it is a num where the sum of dig= product of dig
	 * i/p=123
	 * o/p=true;
	 * exp
	 * ---
	 * 1*2*3=1+2+3=>3
	 */

	public static void main(String[] args) {
		int num=124;
		boolean res=isSpyNum(num);
		System.out.println(res);
	}

	private static boolean isSpyNum(int num) {
		int sum=0;
		int prod=1;
		int n=num;
		while(n>0) {
			int dig=n%10;
			sum+=dig;
			prod*=dig;
			n/=10;
		}
		
		return sum==prod;
	}

}
