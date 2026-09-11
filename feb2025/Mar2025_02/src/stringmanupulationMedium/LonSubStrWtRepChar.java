package stringmanupulationMedium;

public class LonSubStrWtRepChar {

    static void main() {
        String s="abcabcbb";
        int len=longSubStrSlWind(s);
        System.out.println(len);
    }
    static int longSubStr(String s){
        Map<Character,Integer> map = new HashMap<>();
        int left=0;
        int maxLength=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(map.containsKey(ch)&&map.get(ch) >=left){
                left = map.get(ch)+1;
            }
            map.put(ch,right);
            maxLength = Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
    static int longSubStrSlWind(String s){
        int start=0;
        int end=0;
        int maxLen = Math.min(s.length(),1);
        Set<Character> seen = new HashSet<>();
        while(end<s.length()){
            char c = s.charAt(end);
            while (seen.contains(c)){
                seen.remove(s.charAt(start));
                start=start+1;
            }
            seen.add(c);
            int windowSize = end-start+1;
            maxLen = Math.max(maxLen,windowSize);
            end++;

        }
        return maxLen;
    }
}
