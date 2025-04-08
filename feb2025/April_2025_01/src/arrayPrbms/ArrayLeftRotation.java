package arrayPrbms;

import java.util.Arrays;

public class ArrayLeftRotation {
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int n=6;
		System.out.println("Original array:"+ Arrays.toString(arr));
		for(int i=0;i<n;i++) {
			int j,first;
			first=arr[0];
			System.err.println(first);
			for(j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
				System.out.println(Arrays.toString(arr));
				
			}
			arr[j]=first;
			System.err.println(Arrays.toString(arr));
		}
		System.out.println("After shifting:"+Arrays.toString(arr));
	}
}
