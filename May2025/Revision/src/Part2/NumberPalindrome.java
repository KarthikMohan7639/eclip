package Part2;

public class NumberPalindrome {

	public static void main(String[] args) {
		int num=19;
		boolean res= isPalin(num);
		System.out.println(res);
	}

	private static boolean isPalin(int num) {
		int n=num;
		int rev=0;
		while(n>0) 
		{
			int dig=n%10;
			rev=(rev*10)+dig;
			n/=10;
		}
		return rev==num;
	}

}
