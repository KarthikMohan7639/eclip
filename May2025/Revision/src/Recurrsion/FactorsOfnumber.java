package Recurrsion;

public class FactorsOfnumber {
	public static void main(String[] args) {
		int n=16;
		factor(n,1);
	}

	private static void factor(int n,int i) {
		if(i<=n) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
			
			factor(n,i+1);
		}
	}
}
