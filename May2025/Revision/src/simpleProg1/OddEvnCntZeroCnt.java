package simpleProg1;

public class OddEvnCntZeroCnt {

	public static void main(String[] args) {
		int n=21;
		int zeroCnt=0;
		int OddCnt=0;
		int EvnCnt=0;
		for(int i=1;i<=n;i++) {
			if(i%10==0) {
				zeroCnt++;
			}
			else if(i%2==0) {
				EvnCnt++;
			}
			else {
				OddCnt++;
			}
		}
		System.out.println("TotZeros"+zeroCnt);
		System.out.println("TotOdd"+OddCnt);
		System.out.println("TotEve"+EvnCnt);
		
	}
	

}
