package part1;

public class SwapNumberWithoutUsingThirdVariable {

	public static void main(String[] args) {
		int a=5;
		int b=10;
		System.out.println("before swapping:"+"a:"+a+" b:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
//		int temp=0;
//		temp=a;
//		a=b;
//		b=temp;
		System.out.println("after swapping:"+"a:"+a+" b:"+b);
	}

}
