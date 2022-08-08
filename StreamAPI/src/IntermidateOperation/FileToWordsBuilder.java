package IntermidateOperation;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileToWordsBuilder {
	
	Stream.Builder<String> builder = Stream.builder();
	
	public FileToWordsBuilder(String filePath) throws Exception{
		Files.lines(Paths.get(filePath))
				.skip(1)
				.forEach(line ->{
					for(String w : line.split("[ .]+")) {
						builder.add(w);
					}
				});
	}
		public Stream<String> stream(){
			return builder.build();
		}
		
		public static void main(String[] args) throws Exception {
			
			new FileToWordsBuilder("myFile1.txt")
			
			.stream()
			.limit(10)
			.map(w -> w + " ")
			.peek(System.out::println)
			.map(String::toUpperCase)
			.peek(System.out::println)
			.map(String::toLowerCase)
			.forEach(System.out::print);
			
			
			new FileToWordsBuilder("myFile1.txt")
			
			.stream()
			.skip(1)
			.limit(10)
			.sorted()
			.map(w -> w + " ")
			.forEach(System.out::print);
		}
	}

