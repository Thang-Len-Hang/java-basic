package StackDemo;

public class MainForQueueDemo {

	public static void main(String[] args) {
		QueueDemo obj = new QueueDemo(3);
		
		obj.add(4);
		obj.add(5);
		obj.add(7);
		obj.add(9);
		obj.add(11);
		obj.add(12);
		
		obj.print();
		
		System.out.println("Remove: "+obj.remove());
		System.out.println("Remove: "+obj.remove());
		System.out.println("Remove: "+obj.remove());
		
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.print();
		
		System.out.println("Remove: "+obj.remove());
		obj.print();
		
	}

}
