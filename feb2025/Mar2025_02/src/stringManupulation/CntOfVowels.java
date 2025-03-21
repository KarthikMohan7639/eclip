package stringManupulation;

public class CntOfVowels {

	public static void main(String[] args) {
		
		String s="Rhythm";
//		System.out.println(vowelCount(s));
		System.out.println(countVowels(s));
	}
	static int vowelCount(String s) {
		int count=0;
		for(int i =0;i<=s.length()-1;i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				count++;
			}
		}
		return count;
	}
	
	static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase(); // Convert to lowercase to handle uppercase vowels
        
        for (char ch : str.toCharArray()) {
            if ("aeiou".indexOf(ch) != -1) { // Check if character is a vowel
                count++;
            }
        }
        return count;
    }

}
