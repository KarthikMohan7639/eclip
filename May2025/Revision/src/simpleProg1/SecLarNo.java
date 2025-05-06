package simpleProg1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SecLarNo {
	static Scanner sc = new Scanner(System.in);
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		if (a > b && a > c) {
			System.out.println("First greatest no :" + a);
			if (b > c)
				System.out.println("Second Greatest no :" + b);
			else
				System.out.println("Second Greatest no: " + c);
		} else if (b > c && b > a) {
			System.out.println("First greatest no :" + b);
			if (c > a)
				System.out.println("Second Greatest no :" + c);

			else
				System.out.println("Second Greatest no :" + a);
		} else {
			System.out.println("First greatest no :" + c);
			if (a > b)
				System.out.println("Second greatest no :" + a);
			else
				System.out.println("Second greatest no :" + b);

		}

	}

}
