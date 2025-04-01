package stringManupulation;

import java.util.Arrays;
import java.util.Scanner;

public class RansomNote {
	static Scanner sc=new Scanner(System.in);
	public static boolean canConstruct(String ransomNote, String magazine) {
		char[] a=ransomNote.toCharArray();
		char[] b=magazine.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		if(a.equals(b)) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		System.out.println("enter ransomnote ");
		String ransomNote=sc.nextLine();
		System.out.println("enter magazine ");
		String magazine=sc.nextLine();
		boolean res=canConstruct(ransomNote, magazine);
		System.out.println(res);
	}

}
