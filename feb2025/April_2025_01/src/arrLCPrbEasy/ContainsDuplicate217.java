package arrLCPrbEasy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate217 {

	public static void main(String[] args) {
	
		int[] arr1= {1,1,1,3,3,4,3,2,4,2};
		int res=containsDuplicates(arr1);
		System.out.println(res);
		  System.out.println(Arrays.toString(arr1));

	}

	private static int containsDuplicates(int[] nums) {
		if(nums.length==0) return 0;
        int k=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[k++]=nums[i];
            }
        }
      
        return k;
	}

}

