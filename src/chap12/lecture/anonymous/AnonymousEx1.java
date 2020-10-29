package chap12.lecture.anonymous;

public class AnonymousEx1 {
	public static void main(String[] args) {
//익명클래스를 만드는 방식으로 Thread 인스턴스 생성
		Thread t1 = new Thread() {
			@Override
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
		};
		
//익명 구현 클래스를 만드는 방식으로 Thread 인스턴스 생성
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i = 0; i < 5; i++) {
					System.out.println((char)('a'+i));
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		});
		
//Runnable 인터페이스는 추상메소드 하나만(run()) 정의되어있기 때문에
//람다식을 Thread 생성자로 받아서 스레드 생성
		Thread t3 = new Thread(() -> {
			for(int i = 0; i < 5; i++) {
				System.out.println((char)('z'-i));
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}) ;
		
		t1.start();
		t2.start();
		t3.start();
	}
}
