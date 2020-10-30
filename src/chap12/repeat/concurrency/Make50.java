package chap12.repeat.concurrency;

public class Make50 extends Thread{
	private MakeMemory makeMemory;
	
	public void setMakeMemory(MakeMemory makeMemory) {
		this.setName("Make50");
		this.makeMemory = makeMemory;
	}
	
	@Override
	public void run() {
		makeMemory.setMemory(50);
	}
}
