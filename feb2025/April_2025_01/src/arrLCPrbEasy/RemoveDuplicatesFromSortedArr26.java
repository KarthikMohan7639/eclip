package arrLCPrbEasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesFromSortedArr26 {

	public static void main(String[] args) {
		int[] nums = {1,1,2}; // Input array
		int[] expectedNums = {1,2,1}; // The expected answer with correct length

		removeDuplicates(nums);

	}

	private static void removeDuplicates(int[] nums) {
		Integer[] num=new Integer[nums.length];
		int j=0;
		for(int i:nums) {
			num[j++]=i;
		}
		Set<Integer> list=new TreeSet();
		list.addAll(Arrays.asList(num));
		System.out.println(list);
	}

}
