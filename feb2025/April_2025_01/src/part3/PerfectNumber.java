package part3;

import java.util.Scanner;


/*
 * PERFECT NUMBER:
 * ==============
 * I/P: n=28
 * O/P: true
 * Explanation: 1+2+4+7+14=28
 * i.e. sum of all divisors except dividend
 */

public class PerfectNumber 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter a number:");
		int sum=0;
		int num=sc.nextInt();
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum+=i;
			}
		}
		System.out.println((num==sum)?num+" is perfect num" :num+ " is not a perfect number");
	}

}

