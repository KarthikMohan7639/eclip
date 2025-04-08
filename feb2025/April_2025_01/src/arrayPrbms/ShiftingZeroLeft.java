package arrayPrbms;

import java.util.Arrays;

public class ShiftingZeroLeft {

	public static void main(String[] args) {
		int[] arr= {0,1,1,0,0,0,1,0,1};
//		shiftingZeroLeft(arr);
		shiftingZerosRight(arr);
	}

	private static void shiftingZerosRight(int[] arr) {
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					System.out.println(Arrays.toString(arr));
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void shiftingZeroLeft(int[] arr) {
		int temp=0;
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]>arr[j]) 
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					System.out.println(Arrays.toString(arr));
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
