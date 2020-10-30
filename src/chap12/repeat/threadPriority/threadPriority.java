package chap12.repeat.threadPriority;

public class threadPriority {
	public static void main(String[] args) {
		Thread[] threads = new Thread[20];
		for(int i = 0; i < threads.length; i++) {
			threads[i] = new Thread() {
				@Override
				public void run() {
					System.out.println(this.getName());
				}
			};
			if(i < 10) {
				threads[i].setPriority(10);
			} else {
				threads[i].setPriority(1);
			}
		}
		
		for(Thread t : threads) {
			t.start();
		}
	}
}
