package HashTableProblingDemo;

public class EmployeeHashTable {
	StoredEmployee[] hashtable;

	EmployeeHashTable() {
		hashtable = new StoredEmployee[15];
	}

	public Employee remove(String key) {
		int hashKey = findKey(key);
		Employee employee = hashtable[hashKey].employee;
		hashtable[hashKey] = null;

		StoredEmployee[] oldHashtable = hashtable;
		hashtable = new StoredEmployee[oldHashtable.length]; // all array clean
		for (int i = 0; i < oldHashtable.length; i++) {
			if (oldHashtable[i] != null) {
				put(oldHashtable[i].key, oldHashtable[i].employee);
			}
		}

		return employee;
	}

	public int findKey(String key) {
		int hashKey = hashKey(key);

		if (isOccupied(hashKey) && hashtable[hashKey].key.equals(key)) {
			return hashKey;
		}
		int stopIndex = hashKey;

		if (hashKey == hashtable.length - 1) {
			hashKey = 0;
		} else {
			hashKey++;
		}
		while (isOccupied(hashKey) && hashKey != stopIndex && !hashtable[hashKey].key.equals(key)) {
			hashKey = (hashKey + 1) % hashtable.length;
		}
		if (isOccupied(hashKey) && hashtable[hashKey].key.equals(key)) {
			return hashKey;
		} else {
			return -1;
		}
	}

	public void put(String key, Employee employee) {
		int hashKey = hashKey(key);
		if (isOccupied(hashKey)) {
			int stopIndex = hashKey;
			if (hashKey == hashtable.length - 1) {
				hashKey = 0;
			} else {
				hashKey++;
			}

			while (isOccupied(hashKey) && hashKey != stopIndex) {
				hashKey++;
			}

		}

		if (hashtable[hashKey] != null) {
			System.out.println("Array is full.");
		} else {
			hashtable[hashKey] = new StoredEmployee(key, employee);
		}
	}

	public Employee get(String key) {

		int hashKey = findKey(key);

		if (hashKey == -1) {
			return null;
		}

		return hashtable[hashKey].employee;
	}

	public boolean isOccupied(int hashKey) {
		return hashtable[hashKey] != null;
	}

	public int hashKey(String lastName) {
		return lastName.length() % hashtable.length;
	}

	public void print() {
		for (int i = 0; i < hashtable.length; i++) {
			if (hashtable[i] == null) {
				System.out.println("Empty");
			} else {
				System.out.println("Position: " + i + "::" + hashtable[i].employee);
			}
		}
	}
}
