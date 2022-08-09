package AngratamTest;
import java.util.Arrays;

public class Main {

	private static final String TEXT1 = "Hello World";
	private static final String TEXT2 = "DH LL O Woe r l";

	public static void main(String[] args) {

		System.out.println("Is Angratam: " + isAnagram(TEXT1, TEXT2));

	}
 
	public static boolean isAnagram(String text1, String text2) {
		char[] char1 = TEXT1.replaceAll("\\s", "").toLowerCase().toCharArray();
		char[] char2 = TEXT2.replaceAll("\\s", "").toLowerCase().toCharArray();

		if (char1.length != char2.length) {
			return false;

		}

		Arrays.sort(char1);
		Arrays.sort(char2);
		return Arrays.equals(char1, char2);
	}

}
