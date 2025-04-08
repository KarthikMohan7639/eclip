package SubArray;

public class Sub_arrayMaxSum {

	public static void main(String[] args) {
		int[] arr={-1,2,-2,3,-4};
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) 
			{
				System.out.print("[");
				for(int k=i;k<=j;k++) 
				{
				System.out.print(arr[k]+(k<j?",":""));
				}
				System.out.print("]");
				System.out.println();
			}
			System.out.println();
		}
		int maxSum=Integer.MIN_VALUE;
		int currentSum=0;
		for(int num:arr) {
			currentSum+=num;
			if(currentSum>maxSum) {
				maxSum=currentSum;
			}
			if(currentSum<0) {
				currentSum=0;
			}
		}
		System.out.println("MaxSum:"+maxSum);
	}

}
