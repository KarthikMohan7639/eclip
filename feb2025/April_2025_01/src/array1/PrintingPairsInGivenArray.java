package array1;
/*
 * i/p:[2,6,8,10]
 * o/p:(2,6) (2,8) (2,10) (6,8) (6,10) (8,10)
 */
public class PrintingPairsInGivenArray {

	public static void main(String[] args) 
	{
		int arr[] ={2,6,8,10};
		pair(arr);
	}
	public static void pair(int[] a) 
	{
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				System.out.print("("+a[i]+","+a[j]+")"+" ");
			}
			System.out.println();
		}
		
	}

}
