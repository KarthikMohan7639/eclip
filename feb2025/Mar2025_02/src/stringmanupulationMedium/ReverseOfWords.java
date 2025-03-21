package stringmanupulationMedium;

public class ReverseOfWords {

	public static void main(String[] args) {
		String s2="";
		String s="Hello this is world!";
		String res=reversal(s);
		System.out.println(res);
//        String arr[]=s.split(" ");
//        for(int i=arr.length-1;i>=0;i--) {
//        	s2+=reverse(arr[i]);
//        	
//        }
//        System.out.println(s2.trim());
	}
	public static String reverse(String s1) {
		
	return s1+" ";
	}
	
	public static String reversal(String s) {
		StringBuilder sb=new StringBuilder();
		String[] str=s.split(" ");
		for(int i=str.length-1;i>=0;i--) {
			sb.append(str[i]).append(" ");
		}
		return sb.toString().trim();
		
	}
	
	
}
