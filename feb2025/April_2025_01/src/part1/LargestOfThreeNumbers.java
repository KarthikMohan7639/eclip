package part1;

import java.util.Scanner;

public class LargestOfThreeNumbers {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter no1");
		int a=sc.nextInt();
		System.out.println("enter no2");
		int b=sc.nextInt();
		System.out.println("enter no3");
		int c=sc.nextInt();
		if(a>b && a>c) {
			System.out.println("greatest is:"+a);
		}
		else if(b>c && b>a) {
			System.out.println("greatest :"+b);
		}
		else if(c>a && c>b){
			System.out.println("greatest:"+c);
		}
		else {
			System.err.println("enter valid number");
		}
	}

}
