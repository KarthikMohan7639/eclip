package part2;

public class NumPalindrome {
	public static void main(String[] args) {
		int dum=131;
		int rev=0;//1
		int num=dum;
		while(num>0) {
			int dig=num%10;//dig=1 3 
			rev=rev*10+dig;//0+1=1 10+3=13
			num=num/10;//131/10=13 1
		}
		if(dum==rev) {
			System.out.println("palindrome");
		}
		else
			System.out.println("not palindrom");
	}
	
}
