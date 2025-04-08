package string.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StdInBufferedReader 
{
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException 
	{
		System.out.print("Enter Name:");
		String s=br.readLine();
		System.out.println(s);
		System.out.println();
		
//		System.out.println("enter age");
//		int age=Integer.parseInt(br.readLine());
//		System.out.println(age);
		
//		System.out.println("enter elements in the arr");
//		int[] arr=new int[3];
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=Integer.parseInt(br.readLine());
//		}
//		for(int i:arr) {
//			System.out.println(i);
//		}
		
	}

}
