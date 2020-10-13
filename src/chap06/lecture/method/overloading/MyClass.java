package chap06.lecture.method.overloading;

public class MyClass {
	void method1() {
		System.out.println("method1......");
	}
//메소드 오버로딩할 땐 반드시 파라미터의 타입, 개수, 순서가 달라야 함
	void method1(int i) {
		System.out.println("method1######");
	}
	
	void method1(double j) {
		System.out.println("method1******");
	}
//메소드 안 파라미터에 따라 해당하는 메소드를 jvm이 보고 판단해서 실행
	
	void method1(int i, int j) {
		System.out.println("method1 int, int");
	}
	
	void method1(int i, double j) {
		System.out.println("method int, double");
	}
	
	void method1(double i, int j) {
		System.out.println("method double, int");
	}
	
//	int method1(double i, int j) {
//		System.out.println("method double, int");
//		return 3;
//	}
//메소드 타입은 무관
	
	
}
