package HashTableProblingDemo;

import HashTableDemo.HashTableEmployee;
import HashTableDemo.SimpleHashTable;

public class Main {

	public static void main(String[] args) {
		Employee janeJone = new Employee(1, "Jane", "Jones");
		Employee johnDoe = new Employee(2, "John", "Doe");
		Employee marySmith = new Employee(3, "Mary", "Smith");
		Employee mikeWilson = new Employee(4, "Mike", "Wilson");
		Employee maryJames = new Employee(5, "James", "Mary");
		Employee amyStack = new Employee(6, "Amy", "Stack");
		
		//EmployeeHashTable obj = new EmployeeHashTable();
		EmployeeHashtableChaining obj = new EmployeeHashtableChaining();
		
		obj.put("Jones", janeJone);
		obj.put("Doe", johnDoe);
		obj.put("Smith", marySmith);
		obj.put("Wilson", mikeWilson);
		obj.put("Mary", maryJames);
		obj.put("Stack", amyStack);

		obj.print(); 
		
		System.out.println("Remove: "+obj.remove("Smith"));
		obj.print();
		//System.out.println("Stack: "+obj.get("Stack"));
		
		//System.out.println("Stack: "+obj.get("Stack1"));
		
	
		
		
		
		
	}

}
