package part1;

import java.util.Scanner;

public class VowelsOrConsonants {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		String str=sc.next().toLowerCase();
		char ch=str.charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println("vowel");
		}
		else {
			System.out.println("consonant");
		}

	}

}
