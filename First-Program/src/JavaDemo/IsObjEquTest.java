package JavaDemo;

public class IsObjEquTest {

	public static void main(String[] args) {
		Apple obj1 = new Apple("Red");
		Apple obj2 = new Apple("Red");
		Apple obj3 = obj1;

		boolean test = obj1.equals(obj3);
		System.out.println("Obj1 and Obj3 are the same: " + test);

	}

}
