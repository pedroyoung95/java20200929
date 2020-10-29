package chap12.lecture.threadClass;

public class ThreadClassEx1 {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println((char) ('a' + i));
			try {
				Thread.sleep(500); //코드 실행이 0.5초 멈췄다가 다시 실행됨.
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
