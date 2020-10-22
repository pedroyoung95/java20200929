package chap13.textbook.s130201;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동");
		
		Object o = box.get();
				
		if(o instanceof String) {
			String name = (String) o;
		}
		
		
		box.set(new Apple());
		Object o2 = box.get();
		
		if(o2 instanceof Apple) {
			Apple apple = (Apple) box.get();
		}
	}
}
