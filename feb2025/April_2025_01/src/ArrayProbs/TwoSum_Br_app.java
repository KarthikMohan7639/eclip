package ArrayProbs;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 *  Input: nums = [2,7,11,15], target = 9
*	 Output: [0,1]
*	 Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class TwoSum_Br_app {

	public static void main(String[] args) 
	{
		int[] nums= {2,7,11,15};
		int target=9;
		int[] res=twoSum(nums, target);
		System.out.println(Arrays.toString(res));
	}
	public static int[] twoSum(int[] nums, int target) 
	{
		int[] ts=new int[2];
		//sliding window approach time complexity O(n2)
		for(int i=0;i<nums.length;i++) 
		{
			for(int j=i+1;j<nums.length;j++) 
			{
				if(nums[i]+nums[j]==target) 
				{
					ts[0]=i;
					ts[1]=j;
				}
			}
		}
		return ts;
	}

}
