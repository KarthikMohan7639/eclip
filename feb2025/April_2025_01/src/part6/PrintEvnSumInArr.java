package part6;

public class PrintEvnSumInArr {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		int n=arr.length;
		int Evensum=0;
		int oddsum=0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				Evensum+=arr[i];
			}
			else {
				oddsum+=arr[i];
			}
		}
		System.out.println("EvenSum:"+Evensum);
		System.out.println("OddSum:"+oddsum);
	}

}
