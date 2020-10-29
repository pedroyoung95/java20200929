package chap12.textbook.s120202;

public class BeepPrintExample3 {
	public static void main(String[] args) {
		Thread thread = new BeepThread();
		thread.start(); //BeepThread 클래스의 run 메소드 실행
//동시에 BeepPrintExample3 클래스의 메인메소드 실행(for반복문 실행)				
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
