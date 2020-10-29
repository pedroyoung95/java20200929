package chap12.repeat.extendsThread;

public class Test2 extends Thread{
	
	@Override
	public void run() {
		for(int i = 0; i < 3; i++) {
			System.out.println(i);
			try {
				Thread.sleep(300);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
		
}
