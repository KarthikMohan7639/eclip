package simpleProg1;

public class SwapNumWithoutTemp {

	public static void main(String[] args) {
		int a=3;
		int b=2;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}

}
