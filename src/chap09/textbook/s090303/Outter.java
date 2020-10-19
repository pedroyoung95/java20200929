package chap09.textbook.s090303;

public class Outter {
	//자바 7 이전
	public void method1(final int arg) {
		final int localVariable = 1;
//		arg = 100;
//		localVariable = 100;
		class Inner {
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
	//자바 8 이후
	public void method2(int arg) {
		int localVariable = 1;
//		arg = 100;
//		localVariable = 100;
		class Inner {
			public void method() {
				int result = arg + localVariable;
//로컬클래스는 바깥쪽 변수에 접근 시 다 final 변수로 인식
			}
		}
	}
}
