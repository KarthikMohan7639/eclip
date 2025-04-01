package stringmanupulationMedium;

public class LongestCommonPreficOfStringArr {
	static  String longestCommonPrefix(String[] str) {
		if(str==null||str.length==0)
			return "";
		String prefix=str[0];
		for(int i=1;i<str.length;i++) {
			System.out.println(str[i].indexOf(prefix));
			while(str[i].indexOf(prefix)!=0) {
				System.out.println("inside while "+str[i].indexOf(prefix));
				prefix=prefix.substring(0,prefix.length()-1);
				if(prefix.isEmpty())
					return "";
			}
		}
		return prefix;
	}

	public static void main(String[] args) {
		String[] str= {"misindia","misfortune","mistake","mislead"};
		
		String res=longestCommonPrefix(str);
		System.out.println(res);
	}

}
