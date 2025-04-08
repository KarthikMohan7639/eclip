package HashMapProblems;

import java.util.HashMap;
import java.util.Map;

public class CountFreqOfNumsInArr {

	public static void main(String[] args) throws InterruptedException {
		int[] arr = { 1, 1, 1, 2, 2, 3, 4 };
		countFreqOfNum(arr);

	}

	private static void countFreqOfNum(int[] arr) throws InterruptedException {
		Map<Integer, Integer> freqMap = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {

			if (freqMap.containsKey(arr[i])) {
				freqMap.put(arr[i], freqMap.get(arr[i]) + 1);

			} else {
				freqMap.put(arr[i], 1);

			}
		}
		System.out.println("num=freq");
		System.out.println("final result" + freqMap);
		for (int key : freqMap.keySet()) {
            System.out.println(key + " -> " + freqMap.get(key));
        }

	}

}
