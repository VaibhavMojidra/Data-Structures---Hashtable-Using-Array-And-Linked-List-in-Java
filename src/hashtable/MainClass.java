package hashtable;

public class MainClass {
	public static void main(String[] args) {
		HashTable students=new HashTable(10);
		students.put("Riya", "Riya is awesome");//O(1)
		students.put("Richa", "Richa is bold");//O(1)
		students.put("Rohan", "Rohan is fat");//O(1)
		students.put("Shreyas", "Shreyas is fat");//O(n)
		students.put("Payal", "Payal is pagal");//O(1)
		students.put("Vaibhav", "Vaibhav is good");//O(n)
		
		System.out.println(students.get("Richa"));//O(1)
		System.out.println(students.get("Shreyas"));//O(n)
		students.delete("Shreyas");//O(n)
		System.out.println(students.get("Shreyas"));//O(n)
		System.out.println(students.get("Vaibhav"));//O(n)
		System.out.println(students.get("Rohan"));//O(n)
	}
}
