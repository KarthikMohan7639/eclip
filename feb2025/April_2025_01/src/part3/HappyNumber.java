package part3;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	/*
	 * happy number:
	 * ------------
	 * input:19
	 * output:happy number;
	 * explanation
	 *-----------
	 *1sq+9sq - > 1+81 - > 82
	 *8sq+2sq - > 64+4 -> 68
	 *6sq+8sq - > 36+64 -> 100
	 *1sq+0sq+0sq -> 1+0+0 -> 1 
	 *so happy number
	 */

	public static void main(String[] args) {
		int number=19;
		isHappyNumOrNot(number);
		
	}

	private static void isHappyNumOrNot(int n) {
		Set<Integer> set=new  HashSet<>();
		while(n!=1 && !set.contains(n)) {
			set.add(n);
			n=sqOfDig(n);
		}
		System.out.println(set);
		System.out.println(n==1?"happy no":"Sad numbr");
		
	}
	static int sqOfDig(int n) {
		int num=n;
		int sum=0;
		int dig=0;
		while(num>0) {
			 dig=num%10;
			 sum+=(dig*dig);
			 num/=10;
		}
		return sum;
	}

}
