package stringmanupulationMedium;

import java.util.Arrays;

public class CircularPrimeString {
	public static void main(String[] args) {
//		String s="113";
//		char[] a=s.toCharArray();
//		int n=a.length;
//		int b=Integer.parseInt(s);
//		boolean p=isPrime(b);
//		boolean res=isCircularPrime(a, n);
//		System.out.println(p);
		int a=2;
		int b=200;
		while(a<=b) {
			for(int i=0;;i++) {
			if(b%a!=0) {
				System.out.println(a);
			}
		}
		}
	}

	private static boolean isCircularPrime(char[] a, int n) {
		
		for(int j=0;j<n;j++) {
		char first=a[0];
		for(int i=0;i<n-1;i++) {
			a[i]=a[i+1];
			}
		a[n-1]=first;
		String s=new String(a);
		int num=Integer.parseInt(s);
		if(isPrime(num)) 
			return true;
		}
		return false;
		
}

	private static boolean isPrime(int num) {
		// TODO Auto-generated method stub
		
		if(num==1||num==0) {
			return false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
	
	

}

