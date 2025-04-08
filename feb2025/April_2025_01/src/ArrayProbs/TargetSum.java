package ArrayProbs;

import java.util.Arrays;

public class TargetSum {

	public static void main(String[] args) {
		int[] arr= {8,1,2,9,6,5,16,4};
		System.out.println(Arrays.toString(arr));
		int target=10;
		System.out.println("target:"+target);
		targetSum(arr,target); 
	}

	private static void targetSum(int[] arr, int target) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println(arr[i]+"+"+arr[j]);
				}
			}
		}
	}

}
