package chap09.textbook.s090203;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		
		A.B b = a.new B();
		A.B b2 = new A().new B();
//인스턴스 멤버 클래스는 인스턴스 멤버이므로
//A의 인스턴스 안에서 객체를 생성할 수 있음
		b.field1 = 3;
		b.method1();
		
		A.C c = new A.C();
//정적 멤버 클래스는 클래스 맴버이므로
//A 인스턴스 없이 바로 접근해서 객체 생성 가능
		c.field1 = 3;
		c.method1();
		c.method2();
		
		A.C.field2 = 3;
		A.C.method2();
//정적 멤버 클래스의 정적 필드, 정적 메소드는 클래스와 마찬가지로
//가장 바깥쪽 클래스에서 바로 접근 가능
//.으로 연결해가면서 접근
		
		a.method();
//메소드 안에 들어가있는 로컬 클래스
//메소드 호출 시에만 생성
	}
}
