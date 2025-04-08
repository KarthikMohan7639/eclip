package arrayPrbms;

import java.util.Arrays;

public class MissingNuminArr {

	public static void main(String[] args) {
		int arr[]= {1,4,6,9};
		missingNumbers(arr);
	}

	private static void missingNumbers(int[] arr) {
		int temp=0;
		//sorting in ascending order
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]>arr[j]) 
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length-1;i++) {
			int current=arr[i];
			int next=arr[i+1];
			
			if(next-current>1) {
				for(int j=current+1;j<next;j++) {
					System.out.println("missing numbers: "+j);
				}
			}
		}
	}
}
