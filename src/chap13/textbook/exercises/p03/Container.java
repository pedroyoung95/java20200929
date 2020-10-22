package chap13.textbook.exercises.p03;

public class Container<K, V> {
	//field
	private K key;
	private V value;
	
	//set method
	public void set(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	//get method
	public K getKey() {
		return key;		
	}
	public V getValue() {
		return value;
	}
	
	
}
