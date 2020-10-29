package chap12.repeat.concurrency;

public class ConcurrencyEx2 {
	static int field = 0;
	
//	static void inc() {		
//		field++;
//	}
	
	static Object mutex = new Object();
	synchronized static void Inc() {
		synchronized (mutex) {
			field++;
		}		
	};
	
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				for(int i = 0; i < 500000; i++) {
					Inc();					
				}
				System.out.println(field);
			}
		};
		
		Thread t2 = new Thread(() -> {
			for(int i = 0; i < 500000; i++) {
				Inc();				
			}
			System.out.println(field);
		});
		
		t1.start();
		t2.start();
	}
}
