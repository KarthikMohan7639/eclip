package part3;

public class SpyNumber 
/*
 * SPY NUMBER
 * ==========
 * Sum of digits == product of digits
 * e.g: i/p:123
 * o/p: spy number
 * explanation: 1+2+3=6 is equal to 1*2*3=6
 */
{

	public static void main(String[] args) 
	{
		int num=124;
		boolean res=isSpyNum(num);
		System.out.println(res);
	}

	private static boolean isSpyNum(int num) {
		int sum=0;
		int product=1;
		while(num>0) {
			int last=num%10;
			sum+=last;
			product*=last;
			num/=10;
		}
		if(sum==product)
			return true;
		return false;
	}

	

}
