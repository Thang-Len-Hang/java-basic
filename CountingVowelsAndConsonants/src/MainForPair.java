import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MainForPair {
	
	private static final Set<Character> allVowels = 
			new HashSet<>(Arrays.asList('a','e','i','o','u'));
	private static final String str = "Every Good Boy Does File";
	
	public static void main(String[] args) {
		
		//Pair<Integer,Integer> pair = countVowelAndConsonants(str);
		Pair<Long,Long> pair = countVowelAndConsonantsV2(str);
		System.out.println("Vowels: "+pair.getVowel());
		System.out.println("Consonants: "+pair.getConsonant());
	}
	
	private static Pair<Integer,Integer> countVowelAndConsonants(String str){
		str = str.toLowerCase();
		int vowels = 0;
		int consonants = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(allVowels.contains(ch)) {
				vowels++;
			}
			else if(ch >= 'a' && ch <= 'z') {
				consonants++;
			}
		}
		
		return Pair.of(vowels, consonants);
	}
	
	private static Pair<Long,Long> countVowelAndConsonantsV2(String str){
		str = str.toLowerCase();
		
		long vowels = str.chars()
				.filter(c -> allVowels.contains((char)c))
				.count();
		
		long consonants = str.chars()
				.filter(c -> !allVowels.contains((char)c))
				.count();
		
		return Pair.of(vowels, consonants);
	}

}
