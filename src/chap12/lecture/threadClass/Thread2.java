package chap12.lecture.threadClass;

public class Thread2 extends Thread{
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println((char) ('a' + i));
			try {
				Thread.sleep(500); 
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
