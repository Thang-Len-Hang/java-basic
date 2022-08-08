package HashTableDemo;

public class Main {

	public static void main(String[] args) {
		HashTableEmployee janeJone = new HashTableEmployee(1, "Jane", "Jones");
		HashTableEmployee johnDoe = new HashTableEmployee(2, "John", "Doe");
		HashTableEmployee marySmith = new HashTableEmployee(3, "Mary", "Smith");
		HashTableEmployee mikeWilson = new HashTableEmployee(4, "Mike", "Wilson");
		HashTableEmployee maryJames = new HashTableEmployee(5, "James", "Mary");
		
		

		SimpleHashTable obj = new SimpleHashTable();
		obj.put("Jones", janeJone);
		obj.put("Doe", johnDoe);
		obj.put("Smith", marySmith);
		obj.put("Wilson", mikeWilson);
		obj.put("Mary", maryJames);

		obj.print();
		
		System.out.println("Mary: "+obj.get("Mary"));
	}

}
