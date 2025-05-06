package part3;

public class Fact {

	public static void main(String[] args) {
		int n=5;
		int res=1,i;
		for(i=2;i<=n;i++) {
			res*=i;
		}
		System.out.println(res);
	}

}
