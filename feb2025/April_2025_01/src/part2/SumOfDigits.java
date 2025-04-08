package part2;

public class SumOfDigits {

	public static void main(String[] args) {
		int num=12345;
		int n=num;
		int sum=0;
		
		while(n>0) {
			int dig=n%10;
			sum+=dig;
			n/=10;
		}
		System.out.println(sum);
	}

}
