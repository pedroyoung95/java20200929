package chap12.repeat.threadName;

public class ThreadName {
	public static void main(String[] args) {
		Thread t0 = Thread.currentThread();
		System.out.println(t0.getName());
		
		Thread t1 = new Thread();
		System.out.println(t1.getName());
		
		Thread t2 = new Thread();
		t2.setName("스레드2");
		System.out.println(t2.getName());
		
		Thread t3 = new Thread () {
			@Override
			public void run() {
				this.setName("스레드3");
				System.out.println(this.getName());
			}
		};
		t3.start();
	}
}
