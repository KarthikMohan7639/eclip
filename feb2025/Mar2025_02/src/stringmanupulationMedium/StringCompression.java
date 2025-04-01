package stringmanupulationMedium;

import java.util.HashMap;
import java.util.Map;

public class StringCompression {
	static String StringCompr(String str) {
		int count=1;
		StringBuilder sb=new StringBuilder();
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)==str.charAt(i-1)) 
				count++;
			else {
				sb.append(str.charAt(i-1)).append(count);
				count=1;
			}
			
		}
		sb.append(str.charAt(str.length()-1)).append(count);
		
		return sb.toString();
	}

	public static void main(String[] args) {
		String str="aabbcc";
		String res=StringCompr(str);
		System.out.println(res);
		for(int i=1;i<res.length()-1;i++) {
			if(str.charAt(i)==str.charAt(i+1)) {
				System.out.println(true);
			}
		}
		
	}
	

}
