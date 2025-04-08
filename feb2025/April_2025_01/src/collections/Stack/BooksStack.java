package collections.Stack;

import java.util.Stack;

public class BooksStack {
	
	public static void main(String[] args) {
		Stack<Integer> bookISBN=new Stack<Integer>();
		
		bookISBN.push(1);
		bookISBN.push(2);
		bookISBN.push(3);
		bookISBN.push(4);
		
		bookISBN.pop();
		
		System.out.println(bookISBN);
		
	}

}
