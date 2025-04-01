package stringmanupulationMedium;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	static void removeDuplicates(String s) {
		Set<Character> s1=new LinkedHashSet<Character>();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			s1.add(s.charAt(i));
		}
		for(char c:s1) {
			sb.append(c);
		}
		System.out.println(sb);
		
		
	}
	static void removeDuplicateChar(String s) {
		Set<Character> seen=new LinkedHashSet<Character>();
		StringBuilder ss=new StringBuilder();
		System.out.println(seen);
		for(char c:s.toCharArray()) {
			if(!seen.contains(c)) {
				seen.add(c);
				ss.append(c);
				System.out.println(ss);
		}
		}
//		System.out.println(seen);
		System.out.println(ss);
	}

	public static void main(String[] args) {
		String s="hello world";
//		removeDuplicates(s);
		removeDuplicateChar(s);
}
}
