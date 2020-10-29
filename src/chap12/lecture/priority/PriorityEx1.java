package chap12.lecture.priority;

public class PriorityEx1 {
	public static void main(String[] args) {
		Thread[] threads = new Thread[20];
		for(int i = 0; i < threads.length; i++) {
			threads[i] = new Thread() {
				@Override
				public void run() {
					for(int i = 0; i < 20_0000_0000; i++) {						
					}
					System.out.println("완료");
				};
			};
			if( i >10) {
				threads[i].setPriority(10);//1~10의 우선순위 할당, 순위가 높을수록(숫자가 클수록)
			} else {
				threads[i].setPriority(1); //CPU를 많이 차지함
			}			
		}
		
		for(Thread t : threads) {
			t.start();
		}
	}
	
}