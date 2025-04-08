package string.basics;

import java.util.Arrays;

public class StrToCharArr {

	public static void main(String[] args) {
		String s="hello";
		char[] c=new char[s.length()];
		for(int i=0;i<s.length();i++) 
		{
			c[i]=s.charAt(i);
		}
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
		
		char[] ch=s.toCharArray();
		System.out.println(Arrays.toString(ch));
		
	}

}
