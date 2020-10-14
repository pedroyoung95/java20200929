package chap06.lecture.finalKeyword;

public class MyClass {
	int field1;
	final int field2;
	
	final static int field3 = 20;
	final static int field4;
	
	static {
		field4 = 30;
//static field도 선언 될 때나 static block에서 값이 할당되어야 함
	}
	
	public MyClass() {
		field2 = 99;
//final 필드는 선언 될 때나 생성자에서 반드시 값이 할당되어야 함
//생성자에서 값이 한 번 할당되면 그 값이 최종값으로 고정됨
	}
}
