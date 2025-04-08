package part1;

public class NumDiv3and9 {

	public static void main(String[] args) {
		int num=100;
		for(int i=1;i<=100;i++) //div by 3
		{
			if(i%3==0 && i%9==0) {
				System.out.println(i+ " both div by 3 & 9");
			}
				else if(i%3==0) {
				System.out.println(i+" divisible by 3");
			}
				else if(i%9==0) {
				System.out.println(i+" divisible by 9" );
			}
			
		}
	}

}
