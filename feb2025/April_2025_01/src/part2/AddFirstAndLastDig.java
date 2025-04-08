package part2;

public class AddFirstAndLastDig {

	public static void main(String[] args) {
		int num=121;
		String a="";
		a=a+num;
		int first_dig=2;
		int last_dig=3;
		StringBuilder n=new StringBuilder(a);
		n=n.insert(0,first_dig);
		n=n.append(last_dig);
		int res=Integer.parseInt(n.toString());
		System.out.println(n);
	}

}
