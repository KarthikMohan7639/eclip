package part3;

import java.util.Scanner;

public class PrimeOrNot //using main method
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		String s=" is not prime";
		
		for(int i=2;i<num;i++) {
			if(num==0||num==1) 
			{
				System.out.println(s);
			}
			if(num%i!=0) {
				s="not prime";
			}
		}
		System.out.println(s);
		
	}

}
