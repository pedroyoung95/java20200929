package chap12.lecture.threadClass;

public class Thread1 extends Thread{
	@Override //run메소드를 실행시키고자 하는 코드를 넣어서 재정의
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
