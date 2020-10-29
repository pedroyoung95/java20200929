package chap12.lecture.runnable;

public class RunnableInterfaceEx1 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable1());
		Thread t2 = new Thread(new Runnable2());
//스레드 생성 방법1. Runnable 인터페이스 구현 방식 
//Runnable 구현 클래스의 생성자를 Thread 생성자의 파라미터로 받아서 스레드 생성
//Thread 생성자는 파라미터로 Runnable이 구현된 클래스를 받을 수 있음
		t1.start();
		t2.start();
	}
}
