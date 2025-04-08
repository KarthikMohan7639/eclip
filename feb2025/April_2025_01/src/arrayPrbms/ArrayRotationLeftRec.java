package arrayPrbms;

import java.util.Arrays;

public class ArrayRotationLeftRec {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int d=3;
		leftRotate(arr,d);
		printArr(arr);
	}

	private static void leftRotate(int[] arr, int d) {
		int n=arr.length;
		d=d%n;
		reverseArr(arr,0,d-1);
		reverseArr(arr,d,n-1);
		reverseArr(arr,0,n-1);
	}

	private static void reverseArr(int[] arr, int start, int end) {
		int temp=0;
		while(start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	public static void printArr(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
	

}
