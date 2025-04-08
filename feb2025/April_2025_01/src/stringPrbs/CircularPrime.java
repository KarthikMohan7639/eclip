package stringPrbs;

public class CircularPrime {

	public static void main(String[] args) {
		String s="113";
		boolean cp=isCircularPrime(s);
		System.out.println(cp);
	}

	private static boolean isCircularPrime(String s) {
		boolean flag=true;
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			 char first=c[0];
			 for(int j=0;j<c.length-1;j++) {
				 c[j]=c[j+1];
			 }
			 c[c.length-1]=first;
			String nw=new String(c);
			if(isPrime(nw))
				flag=true;
			else
				flag=false;
		}
		
		return flag;
	}

	private static boolean isPrime(String s) {
		int num=Integer.parseInt(s);
		boolean flag=true;
		if(num<=1) {
			flag= false;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0)
				flag= false;
//			else
//				return true;
		}
		return flag;
	}

}
