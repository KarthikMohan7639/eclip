package stringManupulation;

public class FrequencyOfGivenChar {
	static void freq(String s, String key) {
		  if (key.length() != 1) {
	            System.out.println("Error: Key should be a single character.");
	            return;
	        }
		int count=0;
		char k=key.charAt(0);
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==k)
				count++;
		}
		System.out.println(count);
		
	}
	
	
	static void freqofchar(String s,String key) {
		if(key.length()!=1) {
			System.out.println("key should be single char");
			return;
		}
		int count=0;
		char k=key.charAt(0);
		for (char ch:s.toCharArray()) {
			if(ch==k)
				count++;
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		String s="malayalam";
		String key="y";
		freq(s,key);
		freqofchar(s, key);
	}

}
