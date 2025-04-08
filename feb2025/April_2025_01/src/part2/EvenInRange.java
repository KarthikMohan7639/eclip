package part2;

public class EvenInRange {

	public static void main(String[] args) {
		int n=50;
		int i=10;
		while(i<n) {
			if(i%2==0) //check if evn
			{
				System.out.println(i); //print i
			}
			i++;
		}
		System.out.println(i);
	}

}
