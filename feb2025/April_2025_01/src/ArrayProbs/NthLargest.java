package ArrayProbs;

import java.net.SocketTimeoutException;
import java.util.Arrays;

public class NthLargest {

	public static void main(String[] args) {
		int[] a= {10,2,7,4,9,3};
		int n=3;
		int nthLargest=findNthLargest(a,n);
		System.out.println(nthLargest);
	}

	private static int findNthLargest(int[] a, int n) {
		Arrays.sort(a);
		int[] sortedDesc=new int[a.length];
		for(int i=0;i<a.length;i++) {
			sortedDesc[i]=a[a.length-1-i];
		}
		return sortedDesc[n-1];
	}
	

}
