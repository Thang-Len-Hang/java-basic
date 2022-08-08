import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {

	private static final String text = "The book contains 60 pairs of drawings and texts. Each spread is labeled (as in figure) with a number. A drawing is typically understood as an illustrative ";
	
	private static final Pattern pattern = Pattern.compile(" +");
	
	public static void main(String[] args) {

		reverseString();
		
		String reverse = reverseString2();
        System.out.println(reverse);
	}
	
	private static String reverseString2() {
	    return     pattern.splitAsStream(text)
	                .map(w -> new StringBuilder(w).reverse())
	                .collect(Collectors.joining(" "));
	    }

	private static void reverseString() {
		
		String[] words = text.split(" ");
		StringBuilder reverseString = new StringBuilder();

		for (String word : words) {
			StringBuilder reverseWord = new StringBuilder();

			for (int i = word.length() - 1; i >= 0; i--) {
				reverseWord.append(word.charAt(i));
			}

			reverseString.append(reverseWord.append(" "));
		}
		
		System.out.println(reverseString.toString());
	}

}
