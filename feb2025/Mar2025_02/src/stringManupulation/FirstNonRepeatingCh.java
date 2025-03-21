package stringManupulation;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class FirstNonRepeatingCh {

	public static void main(String[] args) {
		String s="hh"
				+ "llo";
		char result=firstNonRepeatingCh(s);
		char res=firstNonRepeatingChar(s);
		char r=first_non_repeating_char(s);
		if(r!='\0') {
			System.out.println(result);
		}
		else {
			System.out.println("non repeating characters not found");
		}
	}

	private static char firstNonRepeatingCh(String s) //brute force approach using two loops
	{
		for(int i=0;i<s.length();i++) {
			boolean isUnique=true;
			for(int j=0;j<s.length();j++) {
				if(i!=j&&s.charAt(i)==s.charAt(j)) {
					isUnique=false;
					break;
				}
			}
			if(isUnique) {
				return s.charAt(i);
			}
		}
		return '\0';
	}
	private static char firstNonRepeatingChar(String s) //array method
	{
		int[] freq=new int[26];//for lower case letters
		for(char ch:s.toCharArray()) {
			freq[ch-'a']++;
		}
		for(char ch:s.toCharArray()) {
			if(freq[ch-'a']==1) {
				return ch;
			}
		}
		return '\0';
		
	}
	 private static char first_non_repeating_char(String s) //Hashmap and queue method time complexity O(n)
	{
		Map<Character,Integer> countMap=new HashMap<>();
		Queue<Character> queue=new LinkedList<Character>();
		for(char ch:s.toCharArray()) {
			countMap.put(ch,countMap.getOrDefault(ch, 0)+1);
			queue.add(ch);
			while (!queue.isEmpty()&&countMap.get(queue.peek())>1) 
			{
				queue.poll();
			}
		
		}
		return queue.isEmpty()?'\0':queue.peek();
	}
}
