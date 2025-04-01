import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Demo {
	
	static String expand(String s) {
		if(s==null||s.isEmpty()) {
			return "";
		}
		StringBuilder sb=new StringBuilder();
		int n=s.length();
		for(int i=0;i<n;i++) {
			char ch=s.charAt(i);
			int count=0;
			
			while(i+1 < n && Character.isDigit(s.charAt(i+1))){
				count=count*10+(s.charAt(++i)-'0');
			}
			while(count-- >0) {
				sb.append(ch);
			}
		}
		return sb.toString();
		
	}

	public static void main(String[] args) {
		String s="a2b2c3";
		
		boolean b=Character.isDigit(s.charAt(0));
		System.out.println(b);
	}

}
