package chap12.lecture.concurrency;

public class ConcurrencyEx2 {
	static int field = 0;
	
	public synchronized static void inc() {
		field++;
	}
//inc()메소드를 동기화(synchronized)
//어떤 스레드가 이 메소드를 사용 중이라면 끝날 때까지 다른 스레드가 사용 불가
//사용 중인 스레드에 메소드를 '동기화'
//인스턴스 메소드, 정적 메소드 모두에 붙일 수 있음
	
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
