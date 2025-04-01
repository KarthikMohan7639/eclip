package stringmanupulationMedium;

public class PosSubStr {
    static void generateSubstrings(String str) {
        int n = str.length();

       
        for (int i = 0; i < n; i++) {
           
        	StringBuilder sb=new StringBuilder();
            for (int j = i; j < n; j++) {
            	sb.append(str.charAt(j));
            	System.out.println(sb);
            }
        }
    }
    static void generateSubstrings1(String str) {
        int n = str.length();

        // Iterate over all possible starting indices
        for (int i = 0; i < n; i++) {
            // Iterate over all possible ending indices
        	
            for (int j = i; j < n; j++) {
            	
            	System.out.println(str.substring(i,j+1));
            }
        }
    }

    public static void main(String[] args) {
        String input = "abc";
        generateSubstrings(input);
        generateSubstrings1(input);
    }
}

