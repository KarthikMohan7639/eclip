package part2;

public class OddNoInRangeRev {

	public static void main(String[] args) {
		int n=20;
		for(int i=n;i>0;i--) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}

}
