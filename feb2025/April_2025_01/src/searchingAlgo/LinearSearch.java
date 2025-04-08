package searchingAlgo;

public class LinearSearch {

	public static void main(String[] args) {
		int[] arr= {45,70,9,78,63,15,43,4,9,7,10};
		int key=11;
		int index=linearSearch(arr,key);
		if(index!=0)
		System.out.println(key+" found at index:"+index);
		else  {
			System.err.println("key not found");
		}
	}

	private static int linearSearch(int[] arr, int key) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			if(arr[i]==key) {
				return i;
			}
		}
		return 0;
	}

}
