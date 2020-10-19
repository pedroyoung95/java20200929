package chap09.lecture.localClass;

public class MyApp {
	public static void main(String[] args) {
		int i = 3;
		System.out.println(i);
		
		class LocalClass {
			int i;
//			static int j;
			
			void method() {}
//			static void method2() {}
//static 멤버 작성X
		}
		LocalClass l1 = new LocalClass();
//로컬클래스는 메소드 안에서만 객체 생성
	}
}
