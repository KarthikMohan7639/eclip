package HashSetProb;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStrWithoutRepeatingCharLen {

	public static void main(String[] args) {
		String str="abcabcbb";
		int res=lengthOfLongestUniqSubStr(str);
		System.out.println(res);
		
	}

	private static int lengthOfLongestUniqSubStr(String s) {
		int start=0;
		int maxLength=0;
		Set<Character> set=new HashSet<>();
		for(int end=0;end<s.length();end++) {
			char currentChar=s.charAt(end);
			while(set.contains(currentChar)) {
				set.remove(currentChar);
				start++;
			}
			set.add(currentChar);
			maxLength=Math.max(maxLength,end-start+1);
		}
		return maxLength;
	}

}
