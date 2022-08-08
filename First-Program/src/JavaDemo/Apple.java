package JavaDemo;

import java.util.Objects;

public class Apple {
	String color;

	Apple(String color) {
		this.color = color;

	}

	@Override
	public int hashCode() {
		return Objects.hash(color);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Apple other = (Apple) obj;
		return Objects.equals(color, other.color);
	}

}
