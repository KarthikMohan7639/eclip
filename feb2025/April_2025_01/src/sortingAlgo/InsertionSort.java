package sortingAlgo;

import java.util.Arrays;

public class InsertionSort {
	/*
	 * Insertion sort
	 * ---------------
	 * 1.Start with the first element (considered sorted).

		2.Pick the next element (unsorted) and compare it with the elements in the sorted portion.
		
		3.Shift the elements in the sorted portion to the right until the correct position for the current element is found.
		
		4.Insert the current element into its correct position.
		
		5.Repeat steps 2–4 for all elements in the array.
	 */

	public static void main(String[] args) {
		int[] arr= {5,1,7,4,8,2};
		int n=arr.length;
		System.out.println("before swapping:"+Arrays.toString(arr));
		for(int i=1;i<n;i++) {
			int current=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>current) {
				arr[j+1]=arr[j];
				System.out.print(" "+arr[j+1]);
				j--;
				System.out.println("at inner loop:"+Arrays.toString(arr));
			}
			arr[j+1]=current;
			System.err.println("at outer loop :"+Arrays.toString(arr));
		}
		System.out.println("after swapping:"+Arrays.toString(arr));
	}

}
