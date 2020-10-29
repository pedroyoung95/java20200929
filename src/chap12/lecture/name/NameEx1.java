package chap12.lecture.name;

public class NameEx1 {
	public static void main(String[] args) {
		Thread th0 = Thread.currentThread(); //현재 실행되는 스레드를 리턴
		System.out.println(th0.getName()); //스레드의 이름을 리턴
		th0.setName("my main thread");
		System.out.println(th0.getName());
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				System.out.println(this.getName());
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}				
				System.out.println(this.getName());
			}
		};
		t1.start();
		t2.start();
//jvm이 run메소드를 실행시키기 때문에, 어떤 메소드의 결과가 먼저 나올지 모름
	}
}
