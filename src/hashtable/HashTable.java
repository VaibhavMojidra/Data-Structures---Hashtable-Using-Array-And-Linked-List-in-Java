package hashtable;

public class HashTable {
	private int tableSize;
	private HashTableItem hashTable[];
	
	public HashTable() {
		this.tableSize = 10;
		this.hashTable = new HashTableItem[tableSize];
	}


	public HashTable(int tableSize) {
		this.tableSize = tableSize;
		this.hashTable = new HashTableItem[tableSize];
	}
	
	
	public boolean put(String key, String Value) {
		int index=getIndex(key);
		System.out.println("Index for "+key+" "+ index);
		if(hashTable[index]==null) {
			hashTable[index]=new HashTableItem();
		}
		return hashTable[index].add(key, Value);
	}
	
	public String get(String key) {
		int index=getIndex(key);
		if(hashTable[index]==null) {
			return null;
		}
		return hashTable[index].getValue(key);
	}
	
	public boolean delete(String key) {
		int index=getIndex(key);
		if(hashTable[index]==null) {
			System.out.println("No value found with key : "+key);
			return false;
		}
		if(!hashTable[index].delete(key)){
			System.out.println("No value found with key "+key);
			return false;
		}
		return true;
	}
	
	private int getIndex(String key) {
		int hashCode=key.hashCode();
		int index=Math.abs(hashCode) %tableSize;
		if(key.equalsIgnoreCase("Rohan")||key.equalsIgnoreCase("Shreyas")||key.equalsIgnoreCase("Vaibhav")) {
			index=4;
		}
		return index;
	}
}
