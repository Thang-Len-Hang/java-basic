package Inheritance;

public abstract class AbstractDemo {

	public abstract void sort();

	public static void main(String[] args) {
		// AbstractDemo obj = new AbstractDemo(); //can't create obj
	}

	public abstract class ChildClass extends AbstractDemo { // Override or casttype abstract
		public abstract void test();
		/*
		 * @Override public void sort() {
		 * 
		 * 
		 * }
		 */

		public final void algo() { // no sub-class no child

		}

	}

	public class AnotherChild extends ChildClass {

		@Override
		public void sort() {

		}

		@Override
		public void test() {

		}

		// public void algo(); //no sub-class no child

	}

}
