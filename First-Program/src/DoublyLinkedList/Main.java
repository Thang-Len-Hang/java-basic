package DoublyLinkedList;

public class Main {

	public static void main(String[] args) {
		DoublyLinkedList obj = new DoublyLinkedList();
		obj.addFirst(5);
		obj.addFirst(7);
		obj.addFirst(9);
		obj.addFirst(8);
		obj.addLast(2);
		obj.addLast(6);

		obj.print();
		System.out.println("Size: " + obj.size);

		System.out.println("\nRemoved First: " + obj.removeFirst());
		obj.print();
		System.out.println("Size: " + obj.size);

		System.out.println("\nRemoved Last: " + obj.removeLast());
		obj.print();
		System.out.println("Size: " + obj.size);
		
		obj.print();
		Node node = new Node();
		node.data = 7;
		obj.addBefore(11, node);
		
		obj.print();
		Node node1 = new Node();
		node1.data = 7;
		obj.addAfter(15, node1);
		
		obj.print();
		
	}

}
