package part6;

import java.util.Arrays;

public class CharArrToASCIIarr {

	public static void main(String[] args) 
	{
		char a[]= {'A','B','C','D'};
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		System.out.println(Arrays.toString(b));
		
	}

}
