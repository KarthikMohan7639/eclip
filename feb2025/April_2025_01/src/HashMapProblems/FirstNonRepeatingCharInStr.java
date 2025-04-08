package HashMapProblems;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharInStr {
//	Problem: Given a string, find the first character that appears only once.
//
//	🧠 Concept: Map character → count, then iterate again.
//
//	Input: "swiss"
//	Output: 'w'

	public static void main(String[] args) {
		String s = "swi";
		char ch=firstNonRepeatingCharInStr(s);
		System.out.println(ch);
	}

	private static char firstNonRepeatingCharInStr(String s) {
		Map<Character, Integer> chCnt = new HashMap<>();
		int i = -1;
		// step 1
		for (Character ch : s.toCharArray()) {
			chCnt.put(ch, chCnt.getOrDefault(ch, 0) + 1);
		}
		System.out.println(chCnt);
		
		//step 2
		for(Character ch:s.toCharArray()) {
			if(chCnt.get(ch)==1) {
				return ch;
			}
		}
		return '\0';

	}
}
