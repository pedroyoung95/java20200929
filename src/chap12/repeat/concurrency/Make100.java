package chap12.repeat.concurrency;

public class Make100 extends Thread{
	private MakeMemory makeMemory;
	
	public void setMakeMemory(MakeMemory makeMemory) {
		this.setName("Make100");
		this.makeMemory = makeMemory;
	}
	
	@Override
	public void run() {
		makeMemory.setMemory(100);
	}
}
