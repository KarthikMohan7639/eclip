package stringmanupulationMedium;

public class StringCompRotAnoStr {
	
	static boolean isRotation(String str1,String str2) {
		if(str1.length()!=str2.length() ||str1.isEmpty()) {
			return false;
		}
		String concatenated=str1+str2;
		return concatenated.contains(str2);
		
	}

	public static void main(String[] args) {
		String str1="abcd";
		String str2="bcad";
		System.out.println(isRotation(str1, str2));
		
	}

}
