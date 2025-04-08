package part1;

import java.util.Scanner;

public class SecondLargest {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a:");
		int a=sc.nextInt();
		System.out.println("Enter b:");
		int b=sc.nextInt();
		System.out.println("Enter c:");
		int c=sc.nextInt();
		if(a>b && a>c) 
		{
//			System.out.println(a+ " is first largest");
			if(b>c) 
			{
				System.out.println(b+" is second largest");
			}
			else 
			{
				System.out.println(c+ " is second largest");
			}
		}
		else if(b>c && b>a) 
		{
//			System.out.println( b +" is first largest");
			if(c>a) {
				System.out.println(c+ " is second largest");
			}
			else {
				System.out.println(a + " is second largest");
			}
		}
		else {
//			System.out.println(c+" is first largest");
			if(a>b) {
				System.out.println(a +" is second largest");
			}
			else {
				System.out.println(b +" is second largest");
			}
		}
		
	}

}
