package part3;

import java.util.Scanner;

/*
 * FACTORS
 * =======
 * Breaking of a number into small
 * i.e all possible divisors including dividend
 * i/p: 10
 * o/p: 1 2 5 10
 * Explanation:1*2*5=10
 */
public class FactorsOfaNumber {
	static Scanner sc=new  Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter a num");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println("factors "+i);
			}
		}
	}

}
