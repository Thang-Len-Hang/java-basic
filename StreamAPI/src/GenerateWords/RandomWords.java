package GenerateWords;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomWords implements Supplier<String> {
	
	List<String> words = new ArrayList<>();
	Random random = new Random(47);
	
	public RandomWords(String fname) throws IOException {
		List<String> lines = 
				Files.readAllLines(Paths.get(fname));
		for(String line : lines.subList(1, lines.size())) { // show output without first line
			for(String word : line.split("[ .?,:]+")) {// to change word
				words.add(word.toLowerCase());
			}
		}
	}
	
	@Override
	public String get() {
		return words.get(random.nextInt(words.size()));
	}

	@Override
	public String toString() {
		return words.stream()
				.collect(Collectors.joining(" ")); 
	}
	
	
	public static void main(String[] args) throws Exception {
		
		System.out.println(
				Stream.generate(new RandomWords("myFile.txt"))
				.limit(10)
				.collect(Collectors.joining(" "))
				);
	}
	
	
}
