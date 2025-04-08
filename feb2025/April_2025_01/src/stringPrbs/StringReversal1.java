package stringPrbs;

import java.util.Arrays;

public class StringReversal1 {
	/*
	 *i/p:"This is Sant"
	 *o/p:"Sant is This"
	 */

	public static void main(String[] args) {
		String s="This is Sant";
		String res="";
		String[] str=s.split(" ");
		System.out.println(Arrays.toString(str));
		for(int i=str.length-1;i>=0;i--) {
			res+=str[i]+" ";
		}
		System.out.println(res);
		
		String s1="Hi How are you";
		System.out.println(s1.length());
		StringBuilder sb=new StringBuilder();
		char[] c=s1.toCharArray();
		System.out.println(c.length);
		for(int i=c.length-1;i>=0;i--) {
			sb.append(c[i]);
		}
		System.out.println(sb);
		
		}
	

}
