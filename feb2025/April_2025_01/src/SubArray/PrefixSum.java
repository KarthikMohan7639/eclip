package SubArray;

import java.util.Arrays;

public class PrefixSum {
	/*
	 * prefix sum
	 * =========
	 * i/p: [1,2,3,4]
	 * o/p: [1,3,6,10]
	 */

	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		int[] res=prefixSum(arr);
		System.out.println(Arrays.toString(res));
	}

	private static int[] prefixSum(int[] arr) {
		int[] res=new int[arr.length];//creating new array
		res[0]=arr[0];//storing 1st val to arr
		for(int i=1;i<arr.length;i++) //traverse arr 1 to len-1
		{
			res[i]=res[i-1]+arr[i];//store previous and arr[i]
		}
		return res;// reeturn arr
	}

}
