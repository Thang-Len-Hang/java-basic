package AbstractFactoryPattern;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Main {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(4);
		al.add(5);
		al.add(7);

		java.util.Iterator itr = al.iterator();
		while (itr.hasNext()) {
			int num = (int) itr.next();
			System.out.println(num);
		}
	}
}
