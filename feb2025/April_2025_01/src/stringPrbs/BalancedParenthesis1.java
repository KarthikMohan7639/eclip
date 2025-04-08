package stringPrbs;

import java.util.ArrayDeque;
import java.util.Deque;

/*test case1
 * =========
 * input:"[({})]"
 * output:true;
 * 
 * test case2
 * =========
 * input:"[{(]}]
 * output:false;
 * 
 */
public class BalancedParenthesis1 {

	public static void main(String[] args) {
		String input="[({})]";
		System.out.println(input.length());
		isValid(input);
	}

	private static void isValid(String s) {
		if(s.length()<=1||s==null) {
			System.out.println("enter valid input");
		}
//		Deque<Character> openStack=new ArrayDeque<>();
//		openStack.push('[');
//		openStack.push('(');
//		openStack.push('{');
//		
//		Deque<Character> closeStack=new ArrayDeque<>();
//		closeStack.push(']');
//		closeStack.push(')');
//		closeStack.push('}');
		
		char[] a=s.toCharArray();
		char[] openBr;
		
	}

	

}
