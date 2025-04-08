package part4;

import java.util.Scanner;

public class DecimalToBinary {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
//		System.out.println("enter a decimal number");
		StringBuilder sb=new StringBuilder();
		int n=0;
		int a=n;
		int rem=0;
		while(a>0) {
//			System.out.println("n"+n);
			rem=a%2;
			sb.append(rem);
//			System.out.println(rem);
			a=a/2;
		}
		if(n<8) {
			sb.append(0);
		}
		 if(n<4) {
			sb.append(00);
		}
		if(n<1) {
			sb.append(000);
		}
		if (n==0){
			sb.append(0000);
		}
		System.out.println(sb.reverse());
	}

}
