package chap13.textbook.exercises.p02;

public class Container<T> {
	//field
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
}
