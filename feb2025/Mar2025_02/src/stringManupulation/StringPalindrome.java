package stringManupulation;

public class StringPalindrome {
	
	 static void stringPalindrome(String s) {
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		String str=sb.toString();
		System.out.println(str.equalsIgnoreCase(s));
		
	}
	 
	
		 public static boolean isPalindrome(String s) {
			 if (s == null || s.length() == 0) {
			        return true;
			    }
			    int left = 0;
			    int right = s.length() - 1;
			    while (left < right) {
			        // Move left pointer to the next alphanumeric character
			        while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
			            left++;
			        }
			        // Move right pointer to the previous alphanumeric character
			        while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
			            right--;
			        }
			        // Compare characters
			        if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
			            return false;
			        }
			        left++;
			        right--;
			    }
			    return true;
		    }

	public static void main(String[] args) {
		String s="A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));
		
	}

}

