package HashTableDemo;

public class SimpleHashTable {
	HashTableEmployee[] hashtable;
	int size = 0;

	public SimpleHashTable() {
		hashtable = new HashTableEmployee[10];
	}

	public void put(String key, HashTableEmployee employee) {
		int hasKey = hashKey(key);
		if (isOccupied(hasKey)) {
			System.out.println(hasKey + " is occupied in hashtable.");
		} else {
			hashtable[hasKey] = employee;
			size++;
		}
	}

	public void print() {
		for (int i = 0; i < hashtable.length; i++) {
			if (hashtable[i] == null) {
				System.out.println("Empty");
			} else {
				System.out.println("Position" + i + ": " + hashtable[i]);
			}
		}
	}

	public HashTableEmployee get(String key) {
		return hashtable[hashKey(key)];
	}

	public int hashKey(String lastName) {
		return lastName.length() % hashtable.length;
	}

	public boolean isOccupied(int index) {
		return hashtable[index] != null;
	}
}
