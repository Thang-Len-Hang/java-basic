import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Main {

	private static final String s1 = "Apple";
	private static final String s2 = "Orange";
	private static final String s3 = "Mango";
	private static final String s4 = "Banana";

	public static void main(String[] args) {
		
		System.out.println(joinStringV3(',',s1,s2,s3,s4));
	}


	private static String joinStringV1(char delimiter, String... str) {
		StringBuilder sb = new StringBuilder();
		int i = 0;
		for (i = 0; i < str.length - 1; i++) {
			sb.append(str[i]).append(delimiter);

		}
		sb.append(str[i]);
		return sb.toString();
	}
	
	private static String joinStringV2(char delimiter, String...str) {
		StringJoiner stringJoiner = new StringJoiner(String.valueOf(delimiter));
		
		for(String  s : str) {
			stringJoiner.add(s);
		}
		
		return stringJoiner.toString();
	}
	
	private static String joinStringV3(char delimiter, String... str) {
		return Arrays.stream(str, 0, str.length)
				.collect(Collectors.joining(String.valueOf(delimiter)));
	}

}
