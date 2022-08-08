import java.util.Objects;

public class Pair <V,C>{
	
	private V vowel;
	private C consonant;
	
	public Pair(V vowel, C consonant) {
		super();
		this.vowel = vowel;
		this.consonant = consonant;
	}
	
	public static <V,C> Pair <V,C> of(V v,C c){
		return new Pair<>(v,c);
	}
	
	

	public V getVowel() {
		return vowel;
	}

	public C getConsonant() {
		return consonant;
	}

	@Override
	public int hashCode() {
		return Objects.hash(consonant, vowel);
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
		return Objects.equals(consonant, other.consonant) && Objects.equals(vowel, other.vowel);
	}
	
	
	
}
