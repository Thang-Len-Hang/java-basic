package TypeSafeCode;

public class MyClass<T, R, M> extends MyParentClass<T, R> {

	private M m;

	public MyClass(T t, R r, M m) {
		super(t, r);
		this.m = m;
	}

	public M getM() {
		return m;
	}

	public void setM(M m) {
		this.m = m;
	}

	
}
