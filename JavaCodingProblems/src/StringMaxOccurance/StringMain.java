package StringMaxOccurance;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import static java.util.Map.Entry.*;
import static java.util.stream.Collectors.*;

public class StringMain {

	private static final String TEXT = "Far From Maddening Crowd";

	public static void main(String[] args) {

		Pair<Character, Long> pair = findMode2(TEXT);
		System.out.format("Max Occurance: [%s]:[%s]", pair.getCharacter(), pair.getOccurance());
	}
	
	public static Pair<Character, Long> findMode2(String s) {
		return s.chars()
				.filter(c -> Character.isWhitespace(c) == false)
				.mapToObj(c -> (char)c)
				.collect(groupingBy(c -> c, counting()))
				.entrySet()
				.stream()
				.max(comparingByValue())
				.map(p -> Pair.of(p.getKey(), p.getValue()))
				.orElse(Pair.of(Character.MIN_VALUE, -1L));
				
	}

	public static Pair<Character, Integer> findMode(String s) {

		Map<Character, Integer> maps = new HashMap<>();

		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			char currentChar = chars[i];
			if (!Character.isWhitespace(currentChar)) {
				Integer ints = maps.get(currentChar);
				if (ints == null) {
					maps.put(currentChar, 1);
				} else {
					maps.put(currentChar, ++ints);
				}
			}
		}

		int intMaxOccurance = Collections.max(maps.values());
		char charMaxOccurance = Character.MIN_VALUE;

		for (Map.Entry<Character, Integer> entry : maps.entrySet()) {
			if (entry.getValue() == intMaxOccurance) {
				charMaxOccurance = entry.getKey();
			}
		}

		return Pair.of(charMaxOccurance, intMaxOccurance);

	}
}
