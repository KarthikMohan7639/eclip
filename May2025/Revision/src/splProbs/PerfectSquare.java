package splProbs;

public class PerfectSquare {

	public static void main(String[] args) {
		int n=8;
		boolean res=isPerfectSq(n);
		System.out.println(res);
	}

	private static boolean isPerfectSq(int n) {
		int num=(int)Math.sqrt(n);
		if((num*num)==n)
			return true;
		else
			return false;
	}

}
