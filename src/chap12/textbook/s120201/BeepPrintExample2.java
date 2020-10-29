package chap12.textbook.s120201;

public class BeepPrintExample2 {
	public static void main(String[] args) {
//		Runnable beepTask = new BeepTask();
//		Thread thread = new Thread(beepTask);
		Thread thread = new Thread(new BeepTask());
		thread.start(); //start()를 사용해서 run()을 실행함
		
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
