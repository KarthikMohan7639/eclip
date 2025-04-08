package part5;

public class FibRec {

	public static void main(String[] args) {
		int n=10;
		for(int i=0;i<n;i++) 
		{
		System.out.print( fibRec(i)+" ");
	}
}

	private static int fibRec(int n) 
	{
		if(n==0)
			return 0; //Base case F(0)=0
		else if(n==1)
			return 1; //base case F(0)=0
		else
			return fibRec(n-1)+fibRec(n-2); //recursive case
	}

}
