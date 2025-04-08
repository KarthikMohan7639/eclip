package ArrayProbs;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,1,2,3,4,5,4,5};
		
		int res[]=removeDuplicate(arr);
		System.out.println(Arrays.toString(res));
	}

	private static int[] removeDuplicate(int[] arr) {
		Arrays.sort(arr);
		int[] b=new int[arr.length];
		int k=0;
		for(int i=0;i<arr.length-1;i++) 
		{
			if(arr[i]==arr[i+1]) {
				b[k++]=arr[i];
			}
		}
		return Arrays.copyOf(b, k);
	}

}
