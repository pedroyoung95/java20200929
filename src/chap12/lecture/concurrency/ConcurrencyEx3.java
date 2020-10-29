package chap12.lecture.concurrency;

public class ConcurrencyEx3 {
	static int field = 0;
	static final Object mutex = new Object();
//동기화 블럭의 파라미터는 객체가 들어감
	
	public synchronized static void inc() {
		synchronized (mutex) {
			field++; //스레드가 나눠서 실행해서는 안될 실행문들은 동기화 블럭으로 감싸줌
//먼저 객체를 획득한 스레드가 동기화 블럭 안 실행문을 사용
//다른 스레드는 이전 스레드가 객체를 놓고, 획득하기 전까지 실행문 사용X
		}		
	}
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for(int i = 0; i < 100_0000; i++) {
//					field++;
					inc();
				}
				System.out.println(getName() + "종료");
				System.out.println(field);
			};
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i = 0; i < 100_0000; i++) {
//					field++;
					inc();
				}
				System.out.println(getName() + "종료");
				System.out.println(field);
			};
		};
		
		t1.start();
		t2.start();
	}
}
