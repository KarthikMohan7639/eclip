package sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr= {3,6,2,1,5};
		int n=arr.length;
		System.out.println("before sorting"+Arrays.toString(arr));
		for(int i=1;i<n;i++) {
			int j=i-1;
			int key=arr[i];
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		for(int num:arr) {
			System.out.print(num+" ");
		}
	}

}