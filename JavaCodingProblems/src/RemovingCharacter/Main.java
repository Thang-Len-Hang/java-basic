package RemovingCharacter;
import java.util.stream.Collectors;

public class Main {
	
	private static final String TEXT = "Life is beautiful!";
	
	public static void main(String[] args) {
		System.out.println(removeCharacter2(TEXT,'b'));
		
	}
	
	public static String removeCharacter(String s,char c) {
		
		char[] chars = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(char c1 : chars) {
			if(c1 != c) {
				sb.append(c1);
			}
		}
		return sb.toString();
	}
	
	public static String removeCharacter2(String s, char c) {
		
		return s.chars()
			.filter(c1 -> c1 != c)
			.mapToObj(c2 -> String.valueOf((char)c2))
			.collect(Collectors.joining());
		
	}

}
