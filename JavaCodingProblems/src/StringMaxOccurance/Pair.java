package StringMaxOccurance;
import java.util.Objects;

public class Pair<T, R> {

	private final T character;
	private final R occurance;

	
	
	public T getCharacter() {
		return character;
	}

	public R getOccurance() {
		return occurance;
	}

	private Pair(T character, R occurance) {
		super();
		this.character = character;
		this.occurance = occurance;
	}

	public static <T, R> Pair<T, R> of(T character, R occurance) {
		return new Pair<>(character, occurance);
	}

	@Override
	public int hashCode() {
		return Objects.hash(character, occurance);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pair other = (Pair) obj;
		return Objects.equals(character, other.character) && Objects.equals(occurance, other.occurance);
	}

}
