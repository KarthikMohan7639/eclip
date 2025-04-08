package array1;

import java.util.Arrays;

public class AddPrimeInArray {

	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int[] res=primeArr(arr);
		System.out.println(Arrays.toString(res));
		
	}
	static int[] primeArr(int[] arr)
	
	{
		int[] res=new int[arr.length];
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(isPrime(arr[i])) {
				res[index++]=arr[i];
			}
		}
		return Arrays.copyOf(res, index);
	}
	private static boolean isPrime(int num) {
		if(num<=1) 
			return false;
		
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;//not prime
			}
		}
		return true; //if num is prime
	}

}
