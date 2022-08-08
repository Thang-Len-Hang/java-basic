package RangeDemo;

public class Bubble {

	public final int i;

	public Bubble(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "Bubble ("+i+")";
	}

	
	private static int count;

	public static Bubble bubbler() {
		return new Bubble(++count);
	}
}
