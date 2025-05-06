package part3;

public class DecToBin {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		
		int num=9;
		String bin=Integer.toBinaryString(num);
		System.out.println(bin);
		
		int n=17;
		int a=n;
		int rem=0;
		while(a>0) {
			rem=a%2;
			sb.insert(0, rem);
			a=a/2;
		}
//		System.out.println("binary:"+(sb.length()>0?sb:"0"));
//		if(n<8) {
//			sb.append(0);
//		}
//		if(n<4) {
//			sb.append(00);
//		}
//		if(n<1) {
//			sb.append(000);
//		}
//		if(n==0) {
//			sb.append(0000);
//		}
//		System.out.println(sb.reverse());

	}

}
