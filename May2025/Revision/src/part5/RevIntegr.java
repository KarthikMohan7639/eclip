package part5;

import java.math.BigInteger;

public class RevIntegr {

	public static void main(String[] args) {
		int n=1534236469;
		BigInteger a=new BigInteger(String.valueOf(n));
		RevIntegr rev=new RevIntegr();
		int ans=rev.reverse(a.intValue());
		System.out.println(ans);
	}
	public int reverse(int x) {
	    // Convert to String
	        String str = Integer.toString(x);
	        boolean isNegative = str.charAt(0) == '-';

	        // Reverse the digits, ignoring the negative sign if present
	        String reversed = new StringBuilder(isNegative ? str.substring(1) : str).reverse().toString();

	        // Reapply the negative sign if needed
	        String res= isNegative ? "-" + reversed : reversed;
	        int result=Integer.parseInt(res);
	        return result;
	    }

}
