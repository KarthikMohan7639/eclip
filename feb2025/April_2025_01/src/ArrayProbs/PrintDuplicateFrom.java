package ArrayProbs;

public class PrintDuplicateFrom {
	
	public static void main(String[] args) {
		int[] arr= {1,1,2,2,3,3,3};
		String res=printDuplicates(arr);
		System.out.println(res);
		
	}

	private static String printDuplicates(int[] arr) {
		StringBuilder res=new StringBuilder();
		boolean hasDuplicates=false;
		for(int i=0;i<arr.length;i++) {
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j] && arr[i]!=Integer.MAX_VALUE) {
					count++;
					arr[j]=Integer.MAX_VALUE;
				}
			}
			if(count>1) {
				hasDuplicates=true;
				res.append(arr[i]).append(" ");		
				}
		}
		return hasDuplicates?res.toString().trim():"No Duplicates";
	}
}
