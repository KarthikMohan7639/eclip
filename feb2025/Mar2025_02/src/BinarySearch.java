import java.util.Scanner;

public class BinarySearch 
/*
 * time complexity:O(n)=log n
 */
{
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		int arr[]= {3,5,7,8,9,10,15,19,21,34,42,47};
		int n=arr.length;
		int key=0;
//		int  res=binarySearch(arr,n,key);
//		System.out.println(res);
		System.out.println(binarySearchR(arr, 0, n-1, key));
	}
	public static int binarySearch(int[] arr,int n,int key) {
		int l=0,h=n-1;
		while(l<=h) {
			int mid=(l+h)/2;
			if(key==arr[mid])
				return mid;
			else if(key>arr[mid])
				l=mid+1;
			else
				h=mid-1;
		}
		return 0;
	}
	
	static int binarySearchR(int[] arr,int l,int h,int key) {
		if (l > h)  // Base case: if range is invalid, return -1 (not found)
            return -1;

        int mid = (l + h) / 2;

        if (arr[mid] == key)
            return mid;
        else if (key < arr[mid])
            return binarySearchR(arr, l, mid - 1, key);
        else
            return binarySearchR(arr, mid + 1, h, key);
		}
	}
