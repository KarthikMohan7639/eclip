package recurrsionSeries;

public class PrintingNumberNt0 {

	public static void main(String[] args) {
		int n=5;
		funcRev(n);
	}
	static void func(int n) {
		if(n==0)
			return;
		System.out.println(n);
		func(n-1);
	}
	static void funcRev(int n) {
		if(n==0)
			return;
		funcRev(n-1);
		System.out.println(n);
	}

}
