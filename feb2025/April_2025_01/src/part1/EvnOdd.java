package part1;

import java.util.Scanner;

public class EvnOdd {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter num:");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println("even");
		}
		else
			System.out.println("odd");

	}

}
