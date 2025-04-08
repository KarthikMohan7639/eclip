package part3;

import java.util.Scanner;

/*
 * perfect square
 * ==============
 * i/p:4
 * o/p:perfect square 
 * explanation: 2x2= 4
 */
public class PerfectSquare 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		String ans="not a perfect square";
		int num=sc.nextInt();
		for(int i=1;i<num;i++) {
			if(num==i*i) {
				ans=" is perfect square ";
				System.out.println(num+ans+i+"*"+i+"="+i*i);
				break;
			}
		}

	}

}
