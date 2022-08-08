package HashTableProblingDemo;

import java.util.LinkedList;
import java.util.ListIterator;

public class EmployeeHashtableChaining {
	LinkedList<StoredEmployee>[] hashtable;

	EmployeeHashtableChaining() {
		hashtable = new LinkedList[10];
		for (int i = 0; i < hashtable.length; i++) {
			hashtable[i] = new LinkedList<StoredEmployee>();

		}
	}

	public Employee get(String key) {
		int hashKey = hashKey(key);
		ListIterator<StoredEmployee> listIterator = hashtable[hashKey].listIterator();
		StoredEmployee employee = null;
		while (listIterator.hasNext()) {
			employee = listIterator.next();
			if (employee.key.equals(key)) {
				return employee.employee;
			}
		}
		return null;
	}

	public Employee remove(String key) {
		int hashKey = hashKey(key);
		ListIterator<StoredEmployee> listIterator = hashtable[hashKey].listIterator();
		StoredEmployee storedEmployee = null;
		int index = -1;
		while (listIterator.hasNext()) {
			storedEmployee = listIterator.next();
			index++;
			if (storedEmployee.key.equals(key)) {
				break;
			}
		}
		if (storedEmployee == null) {
			return null;
		} else {
			hashtable[hashKey].remove(index);
			return storedEmployee.employee;
		}
	}

	public void put(String key, Employee employee) {
		int hashKey = hashKey(key);
		hashtable[hashKey].add(new StoredEmployee(key, employee));
	}

	public int hashKey(String lastName) {
		return lastName.length() % hashtable.length;

	}

	public void print() {
		for (int i = 0; i < hashtable.length; i++) {
			if (hashtable[i].isEmpty()) {
				System.out.println("Position: " + i + " is empty");
			} else {
				System.out.print("Position: " + i + " ");
				ListIterator<StoredEmployee> listIterator = hashtable[i].listIterator();
				while (listIterator.hasNext()) {
					System.out.print(listIterator.next().employee);
					System.out.print(" -> ");
				}
				System.out.println("Null");
			}
		}
	}
}
