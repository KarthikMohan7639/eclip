package part1;


public class EvnOddAndZeroCnt {

	public static void main(String[] args) {
		int n=20;
		int evnCnt=0;
		int OddCnt=0;
		int ZeroCnt=0;
		for(int i=0;i<=n;i++) 
		{
			if(i==0) 
			{
				System.out.println(i+" zero");
				ZeroCnt++;
			}
			else if(i%2==0) 
			{
				System.out.println(i+ " even");
				evnCnt++;
			}
			else 
			{
				System.out.println(i+" odd");
				OddCnt++;
			}
		}
		System.out.println("zerocnt "+ZeroCnt);
		System.out.println("OddCnt "+OddCnt);
		System.out.println("evencnt"+ evnCnt);
	}

}
