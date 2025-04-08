package ArrayProbs;

import java.util.Arrays;

public class NthSmallest {

	public static void main(String[] args) {
		int[] a= {10,2,7,4,9,3};
		int n=3;
		int nthSmallest=findNthSmallest(a,n);
		System.out.println(nthSmallest);
	}

	private static int findNthSmallest(int[] a, int n) {
		Arrays.sort(a);
		return a[n-1];
	}
}
