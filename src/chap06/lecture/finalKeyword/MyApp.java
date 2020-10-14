package chap06.lecture.finalKeyword;

public class MyApp {
	public static void main(String[] args) {
		int i;
		final int j;
		
		i = 30;
		i = 40;
		
		j = 20; //처음 할당받은 값으로 고정, 상수가 됨.
//		j = 10; -> final키워드로 인해 값을 한 번만 할당받음
		
		MyClass o1 = new MyClass();
		o1.field1 = 3;
//		o1.field2 = 4;
		
	}
	
}
