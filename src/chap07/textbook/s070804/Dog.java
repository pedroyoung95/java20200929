package chap07.textbook.s070804;

public class Dog extends Animal{
	public Dog() {
		this.kind = "포유류";
	}
//Animal을 상속받았으므로 Animal의 필드값을 보유하고 있음
//그 필드값의 초기값 자식클래스에서 생성자를 통해 정의할 수 있음
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
