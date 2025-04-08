package exception.customException;

class InvalidAgeException extends Exception {

	public InvalidAgeException(String string) {
		super(string);
	}

	public InvalidAgeException(String message, Throwable cause) {
		super(message,cause);
	}

}

class AgeNotEligibleException extends Exception {
	public AgeNotEligibleException(String message) {
		super(message);
	}

	public AgeNotEligibleException(String message, Throwable cause) {
		super(message,cause);
	}

}

public class customExceptionExample {

	public static void main(String[] args) throws AgeNotEligibleException, InvalidAgeException {
		int age = -1;
		printAge(age);
	}

	private static void printAge(int age) throws AgeNotEligibleException, InvalidAgeException {
		if (age > 1 && age < 18) {
			throw new AgeNotEligibleException("You are not eligible");
		} else if (age < 0) {
			throw new InvalidAgeException("Invalid age");
		} else {
			System.out.println("you are eligible");
		}
	}
}
