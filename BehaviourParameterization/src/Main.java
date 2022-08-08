import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {

		List<Apple> appleList = List.of(new Apple("Red", 2), new Apple("Red", 2), new Apple("Red", 3),
				new Apple("Green", 1), new Apple("Green", 1), new Apple("Green", 3));
		
		

		appleList.stream().filter(a -> a.getColor().equals("Red")).forEach(System.out::println);

		/*
		 * List<Apple> apples = searchAppleByColor(appleList,"Red");
		 * apples.forEach(System.out::println);
		 * 
		 * List<Apple> apples1 = searchAppleBySize(appleList,3);
		 * apples1.forEach(System.out::println);
		 */

		/*
		 * setSearch(new SearchByColor()); List<Apple> apples =
		 * searchStrategy(appleList,"Green"); apples.forEach(System.out::println);
		 */

		/*
		 * setSearch(new SearchBySize()); List<Apple> apples1 =
		 * searchStrategy(appleList, 2); apples1.forEach(System.out::println);
		 */

		// searchLambda(appleList, a -> a.getColor().equals("Green"))
		// searchLambda(appleList, a -> a.getSize() > 2 &&
		// a.getColor().equals("Red")).forEach(System.out::println);

		search(appleList, a -> a.getSize() > 2 && a.getColor().equals("Red")).forEach(System.out::println);

	}

	/*******************************
	 * Behavior Parameterization
	 *************************************/

	private static List<Apple> searchLambda(List<Apple> apples, Predicate<Apple> p) {
		List<Apple> myList = new ArrayList<>();
		for (Apple apple : apples) {
			if (p.test(apple)) {
				myList.add(apple);
			}
		}
		return myList;
	}

	/******************************** Universal Type **********************/

	public static <T> List<T> search(List<T> list, Predicate<T> p) {
		List<T> myList = new ArrayList<>();
		for (T t : list) {
			if (p.test(t)) {
				myList.add(t);
			}
		}
		return myList;
	}

	/********************************************************************/

	public static List<Apple> searchAppleByColor(List<Apple> apples, String color) {
		List<Apple> myList = new ArrayList<>();

		for (Apple apple : apples) {
			if (apple.getColor().equals(color)) {
				myList.add(apple);
			}
		}

		return myList;
	}

	/*************************************************************/

	public static List<Apple> searchAppleBySize(List<Apple> apples, int size) {
		List<Apple> myList = new ArrayList<>();

		for (Apple apple : apples) {
			if (apple.getSize() > (size)) {
				myList.add(apple);
			}
		}

		return myList;
	}

	/************************* Strategy Pattern *********************************/

	private static ISearch search;

	public static void setSearch(ISearch search) {
		Main.search = search;
	}

	public static List<Apple> searchStrategy(List<Apple> apples, Object object) {
		return search.search(apples, object);
	}

}
