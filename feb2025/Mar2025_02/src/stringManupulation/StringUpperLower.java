package stringManupulation;

public class StringUpperLower {
	

	public static void main(String[] args) {
		String s="Hello";
		upper(s);
		lower(s);
	}

	private static void lower(String s) {
		StringBuilder result=new StringBuilder();
		for(char ch:s.toCharArray()) {
			if(ch>='a'&&ch<='z') {
				result.append((char)(ch-32));
			}
			else {
				result.append(ch);
			}
			
		}
		System.out.println(result.toString());
	}

	private static void upper(String s) {
		StringBuilder result=new StringBuilder();
		for(char ch:s.toCharArray()) {
			if(ch>='A'&&ch<='Z') {
				result.append((char)(ch+32));
			}
			else {
				result.append(ch);
			}
			
		}
		System.out.println(result.toString());
	}

}
