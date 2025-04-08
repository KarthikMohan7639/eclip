package HashSetProb;

import java.util.HashSet;
import java.util.Set;

public class CheckForDuplicates {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,1,2};
		boolean res=duplicatePresent(arr);
		boolean res1=duplicatePresent1(arr);
		boolean res2=duplicatePresent2(arr);
		System.out.println(res2?"Duplicate present":"Duplicate not present");
	}

	private static boolean duplicatePresent2(int[] arr) {
		Set<Integer> set=new HashSet<>();
		for(int num:arr) {
			if(!set.add(num)) {
				return true;
			}
		}
		return false;
	}

	private static boolean duplicatePresent(int[] arr) {
		Set<Integer> set=new HashSet<>();
		for(int i:arr) {
			set.add(i);
		}
		
		return arr.length!=set.size();
	}
	
	private static boolean duplicatePresent1(int[] arr) {
		Set<Integer> set=new HashSet<>();
		for(int num:arr) {
			if(set.contains(num)) {
				return true;
			}
			else {
				set.add(num);
			}
		}
		return false;
	}


}
