package arrayPrbms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CharArrayCaseChange {

	public static void main(String[] args) {
		char[] c= {'A','B','C','D','#','$','e','*'};
		int n=c.length;
		for(int i=0;i<n;i++) {
			if(c[i]>='A' && c[i]<='Z') {
				c[i]=(char)(c[i]+32);
			}
			else if(c[i]>='a' && c[i]<='z'){
				c[i]=(char)(c[i]-32);
			}
		}
		System.out.println(Arrays.toString(c));
	}

}
