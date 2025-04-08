package string.basics;

public class CharArrToStr {

	public static void main(String[] args) {
		char[] c= {'h','e','l','l','o'};
		String s="";
		for(int i=0;i<c.length;i++) {
			s+=c[i];
		}
		System.out.println(s);
		
		System.out.println();
		
		String s1=new String(c);
		System.out.println(s1);
	}

}
