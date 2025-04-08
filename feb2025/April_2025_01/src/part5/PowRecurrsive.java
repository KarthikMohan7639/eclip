package part5;

import java.util.Scanner;

public class PowRecurrsive {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		double base=sc.nextDouble();
		double exponent=sc.nextDouble();
		double res=powRecurrsive(base,exponent);
		System.out.println(res);

	}
	private static double powRecurrsive(double base, double exponent) {
		// TODO Auto-generated method stub
		if(exponent==0) {
			return 1;
		}
		else if(exponent<0) {
			return 1/powRecurrsive(base, -exponent);
		}
		else {
			return base*powRecurrsive(base, exponent-1);

		}
	}

}
