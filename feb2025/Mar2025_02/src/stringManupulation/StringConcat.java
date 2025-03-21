package stringManupulation;

public class StringConcat 
/*
 * String concatenation without using '+' and 'concat()' method
 */
{

	public static void main(String[] args) {
		String s1="Hello";
		String s2="World";
		StringBuilder sb=new StringBuilder();
		sb.append(s1);
		sb.append(s2);
		System.out.println(sb.toString());
		
		StringBuilder ss=new StringBuilder();
		ss.insert(0,s1);
		ss.insert(s1.length(),s2);
		System.out.println(ss);
		
		char[] result=new char[s1.length()+s2.length()];
		int index=0;
		
		for(char c:s1.toCharArray()) {
			result[index++]=c;
		}
		for(char d:s2.toCharArray()) {
			result[index++]=d;
		}
		
		System.out.println(new String(result));

	}

}
