package hashtable;

public class HashTableItem { // Linked List
	private HashItem head;


	public HashTableItem() {
		this.head=null;
	}
	public boolean add(String key, String value) {
		HashItem newHashItem=new HashItem(key, value, null);
		if(head==null) {
			head=newHashItem;
			return true;
		}
		else {
			HashItem current=head;
			while(current.getNext()!=null) {
				current=current.getNext();
				System.out.println("Jump");
			}
			current.setNext(newHashItem);
		}
		return true;
	}
	
	public boolean delete(String key) {
		if(head.getKey().equals(key)) {
			head=head.getNext();
			return true;
		}
		HashItem current=head;
		while(current.getNext()!=null) {
			if(current.getNext().getKey().equals(key)) {
				current.setNext(current.getNext().getNext());
				return true;
			}
			current=current.getNext();
		}
		return false;
	}
	
	public String getValue(String key) {
		HashItem current=head;
		while(current!=null) {
			if(current.getKey().equals(key)) {
				return current.getValue();
			}
			current=current.getNext();
		}
		return null;
	}
}
