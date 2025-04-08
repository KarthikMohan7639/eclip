package string.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class StringToIntegr {
	
	static BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException
	{
		System.out.println("enter name");
		String Name=reader.readLine();
		
		System.out.println("Enter age");
		String age=reader.readLine();
		
		System.out.println(Name);
		System.out.println(Integer.parseInt(age)+10);
	}

}
