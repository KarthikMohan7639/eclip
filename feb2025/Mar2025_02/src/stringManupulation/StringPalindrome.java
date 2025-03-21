package stringManupulation;

public class StringPalindrome {
	
	 static void stringPalindrome(String s) {
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		String str=sb.toString();
		System.out.println(str.equalsIgnoreCase(s));
		
	}
	 
	
		 public static boolean isPalindrome(String str) {
		        int left = 0, right = str.length() - 1;
		        
		        while (left < right) {
		            if (str.charAt(left) != str.charAt(right)) {
		                return false;
		            }
		            left++;
		            right--;
		        }
		        return true;
		    }

	public static void main(String[] args) {
		String s="mada";
//		System.out.println(isPalindrome(s.toLowerCase()));
		stringPalindrome(s);
	}

}

