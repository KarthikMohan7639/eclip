package part2;

import java.util.Scanner;

public class XylemPholemNo {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int num=sc.nextInt();
		int ExtSum=0;
		int MeanSum=0;
		int last=num%10;
		num/=10;
		while(num>9) {
			MeanSum=MeanSum+num%10;
			num/=10;
		}
		ExtSum=last+num;
		
		String str=(MeanSum==ExtSum)?"xylem":"pholem";
		System.out.println(str);
	}

}
