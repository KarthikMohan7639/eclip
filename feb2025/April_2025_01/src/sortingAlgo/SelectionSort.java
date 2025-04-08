package sortingAlgo;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr= {5,1,7,4,8,2};
		int temp=0;
		int n=arr.length;
		int index=0;
		System.out.println("before swapping:"+Arrays.toString(arr));
		for(int i=0;i<n-1;i++) {
			 index=i;
			for(int j=i+1;j<n;j++) {
				if(arr[index]>arr[j]) 
					index=j;
			}
			temp=arr[index];
			arr[index]=arr[i];
			arr[i]=temp;
		}
		System.out.println("aftr swapping:"+Arrays.toString(arr));
	}
}
