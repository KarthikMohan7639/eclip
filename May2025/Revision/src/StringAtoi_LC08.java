
public class StringAtoi_LC08 {

	public static void main(String[] args) {
		int res = myAtoi("+1+23");
		System.out.println(res);
	}

	public static int myAtoi(String s) {
		if (s.length() == 0)
			return 0;

		int i = 0;
		while (i < s.length() && s.charAt(i) == ' ') {
			i++;
		}
		if (i == s.length())
			return 0;

		int sign = 1;
		if (s.charAt(i) == '-') {
			sign = -1;
			i++;
		} else if (s.charAt(i) == '+') {
			i++;
		}

		int ans = 0;

		int MAX = Integer.MAX_VALUE;
		int MIN = Integer.MIN_VALUE;

		while (i < s.length() && Character.isDigit(s.charAt(i))) {
			int digit = s.charAt(i) - '0';

			if (ans > MAX / 10 || (ans == MAX / 10 && digit > MAX % 10))
				return sign == 1 ? MAX : MIN;

			ans = ans * 10 + digit;

			i++;
		}

		return (sign * ans);
	}

}
