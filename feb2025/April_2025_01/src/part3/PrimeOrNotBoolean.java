package part3;

import java.util.Scanner;

public class PrimeOrNotBoolean {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter num:");
		int num=sc.nextInt();
		boolean res=isPrime(num);
		System.out.println(res?"is prime":"is not prime");
	}
	private static boolean isPrime(int num) 
	{
		for(int i=2;i<num;i++) 
		{
			if(num==0||num==1)
				return false;
			if(num%i!=0) 
				return true;
			else
				return false;
		}
		return false;
	}

}
