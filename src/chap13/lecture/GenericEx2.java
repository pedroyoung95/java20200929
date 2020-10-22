package chap13.lecture;

public class GenericEx2 {
	public static void main(String[] args) {
		MyClass2<Number> o1 = new MyClass2<>();
		MyClass2<Integer> o2 = new MyClass2<>();
//		MyClass2<Object> o3 = new MyClass2<Object>(); //Number와 그 하위만 가능
		
	}
}
