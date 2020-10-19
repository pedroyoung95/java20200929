package chap09.lecture.anonymous;

public class MyApp {
	public static void main(String[] args) {
		Parent p1 = new Child();
		p1.method1();
		
		Parent p2 = new Parent() {
			@Override
			public void method1() {
				System.out.println("anonymous method1");
			}
		};
		p2.method1();
//클래스 멤버가 적히는 {}를 붙임으로써, 익명 클래스 생성
		
		Parent p3 = new Parent() {
			
		};
//추상클래스를 상속받는 익명 클래스와 그 인스턴스를 동시에 만듦
	}
}
