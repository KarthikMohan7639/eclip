package part4;

public class BinaryToDecimal {

	public static void main(String[] args) {
		int num=1101;
		String n=""+num;
		int sum=0;
		char c;
		StringBuilder sb=new StringBuilder(n);
		int len=sb.length();
		sb.reverse();
		for(int i=0;i<len;i++) {
			c=sb.charAt(i);
			String b=""+c;
			int x=Integer.parseInt(b);
			int y=(int)Math.pow(2,i);
			sum+=x*y;
		}
		System.out.println(sum);
}
}
