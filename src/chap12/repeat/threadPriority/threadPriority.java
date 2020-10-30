package chap12.repeat.threadPriority;

public class threadPriority {
	public static void main(String[] args) {
		Thread[] threads = new Thread[20];
		for(int i = 0; i < threads.length; i++) {
			threads[i] = new Thread() {
				@Override
				public void run() {
					this.getName();
					System.out.println("완료");
				}
			};
		}
	}
}
