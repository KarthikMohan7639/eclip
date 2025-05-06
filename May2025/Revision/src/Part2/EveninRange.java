package Part2;

public class EveninRange {

	public static void main(String[] args) {
		int start=10;
		int end=50;
		while(start<end) {
			if(start%2==0) {
				System.out.println(start);
			}
			start++;
		}

	}

}
