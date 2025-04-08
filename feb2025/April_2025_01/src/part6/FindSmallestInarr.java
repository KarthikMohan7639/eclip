package part6;

public class FindSmallestInarr {

	public static void main(String[] args) {
		int arr[]= {8,4,9,12,5,45,2,10};
		int res=findSmallest(arr);
		System.out.println(res);
		int r=SmallestIndex(arr);
		System.out.println(r);
	}

	private static int findSmallest(int[] a) 
	{
		int smallest=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<smallest) 
			{
				smallest=a[i];
			}
		}
		return smallest;
	}
	static int SmallestIndex(int[] a) {
		int smallest=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<a[smallest]) {
				smallest=i;
			}
		}
		return smallest;
	}

}
