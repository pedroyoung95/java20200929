package chap07.lecture.superConstructor;

public class MyApp {
	public static void main(String[] args) {
		ChildClass o1 = new ChildClass();
//자식클래스로 argument가 없는 인스턴스를 만들면 
//자식클래스에 생성자가 없었어도 자동으로 생성자 만들어짐
		o1.method1();
	}
}
