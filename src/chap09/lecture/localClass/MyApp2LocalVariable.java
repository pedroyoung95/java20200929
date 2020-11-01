package chap09.lecture.localClass;

public class MyApp2LocalVariable {
	public static void main(String[] args) {
		int i = 1;
		
		class LocalClass {
			void method1() {
				System.out.println(i);
				System.out.println(args);
//				i += 1; 
//로컬클래스는 메소드의 지역변수(메소드에서만 쓰이는 변수), 매개변수의 값 변경X 
//로컬클래스는 바깥쪽 지역변수 또는 메소드의 매개변수를 final로 인식하고 사용함(final 생략된 상태)
			}
		}
//		args = new String[3];
//		i += 1;
	}
}
