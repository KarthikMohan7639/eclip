package searchingAlgo;

public class BinarySearchAlgo {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60,70,80};
		int key=60;
		int index=binarySearch(arr,key);
		System.out.println(key+" found at index ");
	}

	private static int binarySearch(int[] arr, int key) {
		int l=0;
		int h=arr.length-1;
		while(l<h) {
			int mid=(l+h)/2;
			if(key==arr[mid]) {
				return mid;
			}
			else if(key<arr[mid]) {
				h=mid-1;
			}
			else {
				l=mid+1;
			}
		}
		return 0;
	}

}
