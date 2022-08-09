package ReverseString;

public class OnlyDigit {

	private static final String digitString = "123456789";

	public static void main(String[] args) {

		boolean test = onlyContainDigitsV3();
		System.out.println("Looping test is only digit::"+test);

	}

	private static boolean onlyContainDigit() {
		char[] charString = digitString.toCharArray();
		for (char c : charString) {
			if (Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean onlyContainDigitsV2() {
		return digitString.matches("[0-9]+");
	}
	
	private static boolean onlyContainDigitsV3() {
		return !digitString.chars()
				.anyMatch(a -> !Character.isDigit(a));
	}
}
