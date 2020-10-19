package chap08.textbook.s080601;

public class ImplementationC implements InterfaceC{
	@Override
	public void methodA() {
		System.out.println("ImplementationC-methodA() 실행");
	}
	@Override
	public void methodB() {
		System.out.println("ImplementationC-methodB() 실행");		
	}
	@Override
	public void methodC() {
		System.out.println("ImplementationC-methodC() 실행");		
	}
//구현한 InterfaceC가 InterfaceA,B 모두 상속받았기 때문에
//C 인터페이스를 구현한 클래스는 
//각 인터페이스의 추상메소드를 재정의해야 함
}
