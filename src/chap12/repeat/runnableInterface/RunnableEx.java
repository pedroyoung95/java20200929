package chap12.repeat.runnableInterface;

public class RunnableEx {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Test1());
		Thread t2 = new Thread(new Test2());
		
		t1.start();
		t2.start();
	}
}
