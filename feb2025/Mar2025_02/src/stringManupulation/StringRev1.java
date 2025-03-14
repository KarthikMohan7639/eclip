package stringManupulation;

import java.awt.im.InputContext;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringRev1 {

	public static void main(String[] args) {
		String str="Hello";
		System.out.println(stringRev(str));
		System.out.println(stringRevMan(str));
		stringRev1(str);
		System.out.println(stringRevRec(str));
		stringRevCol(str);
		stringRevCollMan(str);
	}

	private static String stringRevMan(String str) {
		int left=0;
		int right=str.length()-1;
		char[] chars=str.toCharArray();
		while(left<right) {
			char temp=chars[left];
			chars[left]=chars[right];
			chars[right]=temp;
			left++;
			right--;
		}
		return new String(chars);
	}
	public static void stringRev1(String str) {
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
	}

	private static String stringRev(String str) {
		if(str.isEmpty())
			return str;
		StringBuilder sb=new StringBuilder(str);
		return sb.reverse().toString();
	}
	
	public static String stringRevRec(String str) {
		if(str.isEmpty()) {
			return str;
		}
		return stringRevRec(str.substring(1))+str.charAt(0);
	}
	
	public static void stringRevCol(String str) {
		List<Character> charList=str.chars()
				.mapToObj(c->(char)c)
				.collect(Collectors.toList());
		Collections.reverse(charList);
		String reversedString=charList.stream().map(String::valueOf).collect(Collectors.joining());
		System.out.println(reversedString);
	}
	
	public static void stringRevCollMan(String str) {
		List<Character> charList=str.chars()
				.mapToObj(c->(char)c)
				.collect(Collectors.toList());
		int left=0;
		int right=charList.size()-1;
		while(left<right) {
			char temp=charList.get(left);
			charList.set(left,charList.get(right));
			charList.set(right,temp);
			
			left++;
			right--;
		}
		String reversedString=charList.stream().map(String::valueOf).collect(Collectors.joining());
		System.out.println(reversedString);
	}
	
	
//	public static void stringRevMan(String str) {
//		String result="";
//		for(int i=0;i<str.length();i++) {
//			char current=str.charAt(i);
//			if(result.indexOf(current)==-1) {
//				result=result+current;
//			}
//		}
//		System.out.println(result);
//	}
	
}
