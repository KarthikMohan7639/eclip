package arrayPrbms;

import java.util.Arrays;

public class ArrayRotLeftShift {

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50};
		int k=3; //steps need to shift elements
		arrRotLeftShift(arr,k);
		
	}

	private static void arrRotLeftShift(int[] arr, int d) {
		int n=arr.length;
		int[] temp=new int[n];
		
		d=d%n;//handle d greater than n
		
		if(d==n)
			return;
		
		//copy begining element after d shift
		for(int i=0;i<n-d;i++) 
			temp[i]=arr[i+d];
		
		//copy remaining at back
		for(int i=n-d;i<n;i++) 
			temp[i]=arr[i-(n-d)];
		
		//copy to original array
		for(int i=0;i<n;i++)
			arr[i]=temp[i];
		System.out.println(Arrays.toString(arr));
	}
	

}
