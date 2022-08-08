import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	private static final String TEXT = "The book contains 60 pairs of drawings and texts. Each spread is labeled (as in figure) with a number. A drawing is typically understood as an illustrative ";
	
	public static void main(String[] args) {
		
		Map<Character,Long> result = countDuplicateV2(TEXT);
		
		//System.out.println(Arrays.toString(result.entrySet().toArray()));
		result.forEach((k,v) -> System.out.format("[%s, %s]", k,v));
	}
	
	public static Map<Character, Long> countDuplicate(String text){
		if(text == null || text.isBlank()) {
			return Collections.emptyMap();
		}
		
		Map<Character,Long> result = new HashMap<>();
		
		for(int i = 0; i < text.length(); i++){
			char ch = text.charAt(i);
			
			result.compute(ch, (k,v) -> v == null ? 1 : ++v);
		}
		return result;
	}
	
	public static Map<Character, Long> countDuplicateV2(String text){
		return text
				.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, Collectors.counting()));
	}

}
