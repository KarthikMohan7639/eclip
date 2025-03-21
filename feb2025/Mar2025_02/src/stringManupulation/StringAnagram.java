package stringManupulation;

import java.util.ArrayList;
import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		String s1="silent";
		String s2="listen";
		
		System.out.println(stringAnagram(s1, s2));//using sorting
		
	}
	
	static boolean stringAnagram (String s1,String s2) {
		char[] arr1=s1.toCharArray();
		char[] arr2=s2.toCharArray();
		if(s1.length()!=s2.length()) {
			return false;
		}
		else {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		return (Arrays.equals(arr1, arr2));

		}
	}

}
