package chap12.repeat.extendsThread;

public class Test1 extends Thread{
	
	@Override
	public void run() {
		for(int i = 0; i < 3; i++) {
			System.out.println((char)('A' + i));
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
