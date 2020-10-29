package chap12.lecture.threadClass;

public class ThreadClassEx2 {
	public static void main(String[] args) {
		Thread t1 = new Thread1();
		Thread t2 = new Thread2();
//스레드 생성 방법2. 스레드 상속 받기
//스레드를 상속받은 클래스의 인스턴스 생성하면 스레드로 사용가능
		t1.start();
		t2.start();
//메인 메소드에 의한 메인 스레드 실행 + t1과 t2의 메소드도 같이 실행 
//3개의 코드가 동시에 실행되는 돌아가는 멀티 스레드
		
		for(int i = 0; i < 5; i++) {
			System.out.println((char) ('z'-i));
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
