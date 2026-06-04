package part6;

public class ZigZagArrayMerge {

	public static void main(String[] args) {
		int[] a = {10, 20, 30, 40};
		int[] b = {50, 60, 70, 80};
		int[] c = new int[a.length + b.length];

		int i = 0, j = 0, k = 0;

		// Alternate while both arrays have elements
		while (i < a.length && j < b.length) {
			c[k++] = a[i++];
			c[k++] = b[j++];
		}

		// If any remaining in a
		while (i < a.length) {
			c[k++] = a[i++];
		}

		// If any remaining in b
		while (j < b.length) {
			c[k++] = b[j++];
		}

		// Print result
		System.out.print("ZigZag merge: ");
		for (int idx = 0; idx < c.length; idx++) {
			System.out.print(c[idx]);
			if (idx < c.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}
}
