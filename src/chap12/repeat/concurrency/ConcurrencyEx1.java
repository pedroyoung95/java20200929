package chap12.repeat.concurrency;

public class ConcurrencyEx1 {
	static int field = 0;
	
	synchronized static void Inc() {
		field++;
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
