package chap12.repeat.concurrency;

public class MakeResult {
	public static void main(String[] args) {
		MakeMemory makeMemory = new MakeMemory();
		
		Make100 make100 = new Make100();
		make100.setMakeMemory(makeMemory);
		make100.start();
		
		Make50 make50 = new Make50();
		make100.setMakeMemory(makeMemory);
		make50.start();
				
		
		
	}
}
