package chap12.textbook.s120203;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름: " + mainThread);
		
		ThreadA threadA = new ThreadA(); 
//ThreadA는 Thread를 상속받았기 때문에, ThreadA타입은 Thread타입과 동일
		System.out.println("작업 스레드 이름: " + threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("작업 스레드 이름: " + threadB.getName());
		threadB.start();
	}
}
