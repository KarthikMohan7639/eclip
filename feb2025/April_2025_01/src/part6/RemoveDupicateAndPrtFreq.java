package part6;

public class RemoveDupicateAndPrtFreq {

	public static void main(String[] args) {
		int[] arr= {1,2,1,2,3,4,5,7,4};
		int count=1;
		for(int i=0;i<arr.length-1;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]==arr[j]) 
				{
					count++;
					arr[j]=-1;
				}
			}
			if(arr[i]!=-1&&count>1) 
			{
				System.out.print(arr[i]+" ");
			}
		}
		
	}

}
