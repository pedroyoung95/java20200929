package chap12.repeat.runnableInterface;

public class Test2 implements Runnable{
	@Override
	public void run() {
		for(int i = 0; i < 3; i++) {
			System.out.println((char)('z'-i));
			try {
				Thread.sleep(200);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
