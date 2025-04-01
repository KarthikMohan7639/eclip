package stringmanupulationMedium;

public class CountAndSay {
	
	public static String countAndSay(int n) 
	{
		String curr="1";
		for(int k=1;k<n;k++) 
		{
			String next="";
			int i=0;
			while(i<curr.length())   
			{
				int currentCharCount=1;
				while(i<curr.length()-1&&(curr.charAt(i)==curr.charAt(i+1))) 
				{
					currentCharCount++;
					i++;
				}
				next=next+Integer.toString(currentCharCount)+curr.charAt(i);
				i++;		
			}
			curr=next;
		}
		return curr;
		
	}

	public static void main(String[] args) {
		int n=5;
		System.out.println(countAndSay(n));
	}

}
