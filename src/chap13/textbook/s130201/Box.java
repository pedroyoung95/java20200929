package chap13.textbook.s130201;

public class Box {
	private Object object;
	
	public void set(Object object) {
		this.object = object;
	}
	public Object get() {
		return object;
	}
}
//모든 클래스의 부모인 Object클래스를 이용해 
//모든 인스턴스를 받고, 읽는 용도로 사용
