package TypeSafeCode;

import java.util.ArrayList;

public class TypeEraser {
	public static void main(String[] args) {
		
		ArrayList<Integer> il = new ArrayList<>();
		ArrayList<String> sl = new ArrayList<>();
		boolean test = il.getClass() == sl.getClass();
		
		System.out.println(test );
	}
}
