package stringmanupulationMedium;

import java.text.StringCharacterIterator;
import java.util.Arrays;

public class VdPalIgnCaseAndSpCh {
	
	static boolean isPalindrome1(String s) {
		int left=0,right=s.length()-1;
		while(left<right) {
			//moving left pointer
			while(left<right && !Character.isLetterOrDigit(s.charAt(left))) {
				left++;
			}
			//moving right pointer
			while(left<right && !Character.isLetterOrDigit(s.charAt(right))) {
				right--;
			}
			if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	static boolean isPalindrome(String s) {
		StringBuilder cleaned=new StringBuilder();
		
		for(char c:s.toCharArray()) {
			
			if(Character.isLetterOrDigit(c))
				
				cleaned.append(Character.toLowerCase(c));
				
		}
		return cleaned.toString().equals(cleaned.reverse().toString());
	}
	public static void main(String[] args) {
		String s="Malayalam!";
		System.out.println(isPalindrome(s));
		System.out.println(isPalindrome1(s));
	

	}

}
