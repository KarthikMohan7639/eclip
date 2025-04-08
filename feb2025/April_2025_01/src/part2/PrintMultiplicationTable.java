package part2;

import java.util.Scanner;

public class PrintMultiplicationTable {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter number to print table");
		int n=sc.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(n+" * "+i+" = "+n*i);
		}
	}

}
