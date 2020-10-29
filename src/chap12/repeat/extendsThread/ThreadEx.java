package chap12.repeat.extendsThread;

public class ThreadEx {
	public static void main(String[] args) {
//메인메소드 실행부터 이미 하나의 스레드가 작동 중
		Thread t1 = new Test1();
		Thread t2 = new Test2();
		
		t1.start();
		t2.start();
	}
}
