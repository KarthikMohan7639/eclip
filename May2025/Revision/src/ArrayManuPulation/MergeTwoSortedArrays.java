package ArrayManuPulation;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int[] arr1 = { 1, 4, 7, 8, 10 };
		int[] arr2 = { 2, 3, 9 };
		merge(arr1, arr2);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

	}

	private static void merge(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;

		int gap = nextGap(n + m);

		while (gap > 0) {
			int i = 0, j = gap;
			while (j < n + m) {
				int val1 = (i < n) ? arr1[i] : arr2[i - n];
				int val2 = (j < n) ? arr1[j] : arr2[j - n];
				if (val1 < val2) {
					if (i < n && j < n) {
						swap(arr1, i, j);
					} else if (i < n) {
						int temp = arr1[i];
						arr1[i] = arr2[j - n];
						arr2[j - n] = temp;
					} else {
						swap(arr2, i - n, j - n);
					}
				}
				i++;
				j++;
			}
			gap=nextGap(gap);
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private static int nextGap(int gap) {
		if (gap <= 1)
			return 0;
		return (gap / 2) + (gap % 2);
	}

}
