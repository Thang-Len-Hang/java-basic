package LinkedList;

public class Main {

	public static void main(String[] args) {
		Linked_List_Demo obj = new Linked_List_Demo();

		obj.addFirst(5);
		obj.addFirst(7);
		obj.addFirst(2);
		obj.addFirst(3);


		obj.print();

		System.out.println("Size: " + obj.size);
		System.out.println(obj.getFirst());
		obj.print();
		System.out.print("Size: " + obj.size);
	}


}
