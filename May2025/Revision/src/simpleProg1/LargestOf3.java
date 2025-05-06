package simpleProg1;

public class LargestOf3 {
	public static void main(String[] args) {
		int a=3;
		int b=4;
		int c=1;
		if(a>b && a>c) {
			System.out.println("Largest no is "+ a);
		}
		else if(b>c && b>a) {
			System.out.println("Largest no is "+b);
		}
		else {
			System.out.println("Largest no is "+ c);
		}
	}
}
