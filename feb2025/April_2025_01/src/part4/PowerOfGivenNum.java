package part4;

import java.util.Scanner;

public class PowerOfGivenNum {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		double base=sc.nextDouble();
		double exponent=sc.nextDouble();
		double res= powIterative(base,exponent);
		System.out.println(res);

	}
	private static double powIterative(double base, double exponent) {
		double result=1;
		for(int i=0;i<Math.abs(exponent);i++) 
		{
			result*=base;
		}
		if(exponent<0) 
		{
		 return 1/result;	
		}
		return result;
	}

}
