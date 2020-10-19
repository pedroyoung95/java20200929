package chap09.lecture.nestedClass;

public class MyClass {
	
	class Class1 {
		int i;
//		static int j;
		
		Class1() {}
		
		Class1(int i) {}
		
		void method() {}
	}
//Class1은 인스턴스 멤버 클래스
	
	static class Class2 {
		int i;
		static int j;
		
		Class2() {}
		
		Class2(int i) {}
		
		void method() {}
	}
//Class2는 클래스 멤버 클래스 
}
