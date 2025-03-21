package stringManupulation;

public class LengthOfString {

	public static void main(String[] args) {
		String s=new String("Hello ");
		int len=0;
		try {
			while(true) {
				s.charAt(len);
				len++;
			}
		}
		catch(IndexOutOfBoundsException e) {
			
		}
		System.out.println("length of the given string is "+len);
		
		System.out.println(s.length());
		char[] c=s.toCharArray();
		int length=0;
		int count=0;
		for(int i=0;i<c.length;i++) {
				length++;
		}
		for(char d:s.toCharArray()) {
			count++;
		}
		System.out.println(length);
		System.out.println(count);

	}

}
