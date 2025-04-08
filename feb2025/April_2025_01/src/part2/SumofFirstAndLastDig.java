package part2;

import java.util.Scanner;

public class SumofFirstAndLastDig {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int num=sc.nextInt();
		if(num>=0 && num<=9) {
			System.out.println("enter valid number");
		}
		else {
			int last=num%10;
			int sum=0;
			while(num>9) {
				num/=10;
			}
			int first=num;
			sum=first+last;
			System.out.println("first:"+first+" last:"+last+" sum:"+sum);
		}
	}

}
