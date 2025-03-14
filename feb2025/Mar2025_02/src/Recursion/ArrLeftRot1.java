package Recursion;

import java.util.Arrays;

public class ArrLeftRot1 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int d=2;
		int res[]=arrleftrot(a,d);
		System.out.println(Arrays.toString(res));
	}

	private static int[] arrleftrot(int[] a, int d) {
		for(int k=1;k<=d;k++) {
			int first=a[0];
			for(int i=0;i<a.length-1;i++) {
				a[i]=a[i+1];
			}
			a[a.length-1]=first;
		}
		return a;
	}

}
