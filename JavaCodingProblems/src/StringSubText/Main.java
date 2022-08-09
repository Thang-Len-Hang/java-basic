package StringSubText;

public class Main {

	private static final String TEXT = "Hello World! Life dpends on Liver!";

	public static void main(String[] args) {

		System.out.println(isSubText(TEXT, "Liver"));
	}

	public static boolean isSubText(String text, String subText) {
		return text.indexOf(subText) != -1;
	}
}
