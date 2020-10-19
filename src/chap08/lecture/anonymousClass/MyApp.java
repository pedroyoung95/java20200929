package chap08.lecture.anonymousClass;

public class MyApp {
	public static void main(String[] args) {
		MyInterface o1 = new MyClass();
		o1.method1();
//인터페이스를 구현하는 클래스를 만들고
//그 인스턴스를 인터페이스에 할당해야 인터페이스 메소드 실행 가능
		
		MyInterface o2 = new MyInterface() {
			public void method1() {
				System.out.println("anonymous class method1");
			}
		};
//이름없는 클래스이기 때문에 인터페이스이름이 ()앞에 옴
//{} 안에 인터페이스의 추상메소드를 전부 재정의
//class 클래스명 {} 형태에서 클래스이름이 없기 때문에 {}만 남았다고 생각
	}
}
