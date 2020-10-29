package chap12.lecture.concurrency;

public class ConcurrencyEx1 {
	static int field = 0;
	
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for(int i = 0; i < 100_0000; i++) {
					field++;
				}
				System.out.println(getName() + "종료");
				System.out.println(field);
			};
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i = 0; i < 100_0000; i++) {
					field++;
				}
				System.out.println(getName() + "종료");
				System.out.println(field);
			};
		};
		
		t1.start();
		t2.start();
//두 스레드가 하나의 CPU를 공유하면서 동시 실행되다 보니
//field값에 대한 일관성이 보장되지 않음
//최선은 두 스레드가 같은 값, 같은 객체를 공유하지 않도록 해야 함
	}
}
