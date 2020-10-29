package chap12.textbook.s120401;

public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
	
//	public synchronized void setMemory(int memory) {
//		synchronized (this) {
//			this.memory = memory;
//			try {
//				Thread.sleep(2000);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//			System.out.println(Thread.currentThread().getName() + " : " + this.memory);
//		}		
//	}
	
//	public void setMemory(int memory) {
//		this.memory = memory;
//		try {
//			Thread.sleep(2000);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
//	}
}
