package stringmanupulationMedium;

public class StringExpansion {
	static String strExpand(String str) {
		StringBuilder expand=new StringBuilder();
		int n=str.length();
		for(int i=0;i<n;i++) {
			char ch=str.charAt(i);
			int count=0;
			// Extract the number (multi-digit handling)
			while(i+1<n && Character.isDigit(str.charAt(i+1))) {
				count=count*10+(str.charAt(i+1)-'0');
				i++;
			}
			// If no number follows, default count to 1
			if(count==0) count=1;
			 // Append the character 'count' times
			while(count-- >0)
				expand.append(ch);
		}
		return expand.toString();
	}
	public static void main(String[] args) {
		String str="ab3c";
		String s=strExpand(str);
		System.out.println(s);
	}

}
