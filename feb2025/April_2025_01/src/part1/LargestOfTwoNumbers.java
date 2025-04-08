package part1;

import java.util.Scanner;

public class LargestOfTwoNumbers {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter first number:");
		int a=sc.nextInt();
		System.out.println("enter second number:");
		int b=sc.nextInt();
		if(a>b) {
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}
	}

}
