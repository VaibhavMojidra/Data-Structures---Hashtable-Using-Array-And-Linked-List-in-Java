package hashtable;

public class HashItem { // Linked List Item
	private String key;
	private String value;
	private HashItem next;
	
	
	public HashItem() {
		key=value=null;
		next=null;
	}


	public HashItem(String key, String value, HashItem next) {
		this.key = key;
		this.value = value;
		this.next = next;
	}


	public String getKey() {
		return key;
	}


	public void setKey(String key) {
		this.key = key;
	}


	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}


	public HashItem getNext() {
		return next;
	}


	public void setNext(HashItem next) {
		this.next = next;
	}
	
	
}
