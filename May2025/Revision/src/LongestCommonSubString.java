
public class LongestCommonSubString {
	/*
	 * input
	 * ------
	 *
	 * s1="flower"
	 * s2="flow;
	 * s3="flight"
	 *  
	 *  output
	 *  ======
	 *  "fl"
	 * 
	 */
	public static void main(String[] args) {
		String s1="pflower";
		String s2="flow";
		String s3="flight";
		String n1="";
		String n2="";
		for(char c:s1.toCharArray()) {
			for(char d:s2.toCharArray()) {
				if(c==d) {
					n1+=c;
				}
			}
		}
		
		for(char k:s3.toCharArray()) {
			for(char l:n1.toCharArray()) {
				if(k==l) {
					n2+=k;
				}
			}
		}
		
		System.out.println(n2);

	}

}
