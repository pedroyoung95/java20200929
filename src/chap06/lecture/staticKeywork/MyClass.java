package chap06.lecture.staticKeywork;

public class MyClass {
	static int var2;
//var2는 static field, 클래스에 고정된 class field
//class field이므로, 인스턴스 생성 없이 사용 가능
	int var1; 
//객체에 의해 만들어질 인스턴스의 필드(속성)
//인스턴스를 만들어야만 사용 가능
	
	static {
		System.out.println("static block");
		var2 = 3000;
	}
//메소드의 생성자 처럼, 클래스 로딩 시 맨 처음 실행되는 정적 블럭
//필드의 초기값을 가장 먼저 초기화 하는 용도로 사용
	
	void method1() {
		System.out.println(var1);
	}
//인스턴스의 메소드(기능)
//인스턴스의 멤버이므로, 인스턴스를 만들어야만 사용 가능
	
	static void method2() {
//		System.out.println(var1);
//var1은 인스턴스 필드(멤버)이므로, 클래스 메소드(멤버)가 접근 불가
//클래스 멤버가 여러 인스턴스 멤버 중 어떤 것에 접근할지 모르기 때문
//여러 인스턴스 멤버는 클래스 멤버에 접근가능(하나의 클래스 멤버를 공유하기 때문)
		System.out.println(var2);
	}
//정적 메소드(클래스 메소드)
//인스턴스 생성 없이 실행 가능
//같은 클래스를 공유하는 모든 객체들에서 실행 가능
	
}
