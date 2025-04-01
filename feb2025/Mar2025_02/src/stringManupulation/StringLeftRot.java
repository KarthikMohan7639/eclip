package stringManupulation;

import java.util.Arrays;

public class StringLeftRot {
	static String leftRot(String str,int r) {
		int n=str.length();
		
		//hadling r >n
		r=r%n;
		
		return str.substring(r)+str.substring(0,r);
		
	}
	static String leftRotate(String str, int r) {
        int n = str.length();
        r = r % n; // Handle cases where r > n
        char[] arr = str.toCharArray();

        // Reverse first r characters
        reverse(arr, 0, r - 1);
        System.out.println(Arrays.toString(arr));

        // Reverse remaining characters
        reverse(arr, r, n - 1);
        System.out.println(Arrays.toString(arr));

        // Reverse the whole string
        reverse(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
        return new String(arr);
    }

    static void reverse(char[] arr, int left, int right) {
        char temp;
        while (left < right) {
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

	public static void main(String[] args) {
		String str="abcdef";
		int r=2;
		String l=leftRot(str,r);
		String le=leftRotate(str, r);
		System.out.println(le);
		//System.out.println(l);

	}

}
