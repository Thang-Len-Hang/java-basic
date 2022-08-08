package TypeSafeCode;

public class MyParentClass<T, R> {

	private T t;
	private R r;

	public MyParentClass(T t, R r) {
		super();
		this.t = t;
		this.r = r;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public R getR() {
		return r;
	}

	public void setR(R r) {
		this.r = r;
	}

}
