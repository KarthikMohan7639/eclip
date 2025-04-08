package part3;

public class FibonocciIterative {

	public static void main(String[] args) {
		int a=0;//first term
		int b=1;//second term
		System.out.print(a+","+b); //print 1st & 2nd term
		int n=10; //number of term in series
		for(int i=2;i<n;i++) 
		{
			int c=a+b;//calculate next term
			System.out.print(","+c);//print next term
			a=b;//update previous term
			b=c;
		}
	}

}
