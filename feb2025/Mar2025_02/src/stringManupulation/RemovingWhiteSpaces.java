package stringManupulation;

public class RemovingWhiteSpaces {

	public static void main(String[] args) {
		String s=" Hello World ";
		remWhitSp(s);

	}
	
	static void remWhiteSpaces(String s) {
		String[] str=s.split("\\s");
		String s2="";
		for(int i=0;i<str.length;i++) {
			s2=s2+str[i];
		}
		System.out.println(s2);
	}
	
	static void remWhiteSpace(String s) {
		System.out.println(s.replace(" ",""));
		System.out.println(s.replaceAll(" ",""));
	}
	
	//most efficient way time complexity is O(n)
	static void remWhiteSpace1(String s) 
	{
		StringBuilder sb=new StringBuilder();
		for(char c:s.toCharArray()) {
			if(c!=' ') {
				sb.append(c);
			}
		}
		System.out.println(sb);
		
	}
	
	static void remWhiteSp(String s) {
		String[] words=s.split(" ");
		String op=s.join("", words);
		System.out.println(op);
	}
	
	static void remWhitSp(String s) {
		StringBuilder sb=new  StringBuilder();
		for(char c:s.toCharArray()) {
			if(!Character.isWhitespace(c)) {
				sb.append(c);
			}
		}
		System.out.println(sb.toString());
		
	}
	

}
