package stringManupulation;

public class RightRotationInPlace {
    static String rightRotate(String str, int r) {
        int n = str.length();
        r = r % n; // Handle cases where r > n
        char[] arr = str.toCharArray();

        // Reverse the whole string
        reverse(arr, 0, n - 1);

        // Reverse first r characters
        reverse(arr, 0, r - 1);

        // Reverse remaining characters
        reverse(arr, r, n - 1);

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
    static String rightRot(String str,int r) {
    	int n=str.length();
    	return str.substring(n-r)+str.substring(0,n-r);
    }
    public static void main(String[] args) {
		String str="abcdef";
		int r=2;
		System.out.println(rightRot(str, r));
		System.out.println(rightRotate(str, r));
	}
}
