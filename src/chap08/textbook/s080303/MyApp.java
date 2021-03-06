package chap08.textbook.s080303;

import chap08.textbook.s080201.RemoteControl;

public class MyApp {
	public static void main(String[] args) {
		SmartTelevision o1 = new SmartTelevision();
//		RemoteControl r1 = new SmartTelevision();
//		Searchable s1 = new SmartTelevision();
//구현객체를 바로 인터페이스 타입 변수에 할당 가능
		RemoteControl r1 = o1;
		Searchable s1 = o1;
//두 인터페이스 모두 구현했으므로
//인스턴스가 각 인터페이스 변수에 저장될 수 있음
		
		s1.search("daum");
//		s1.turnOn();
//		s1.turnOff();
		
		r1.turnOff();
		r1.turnOn();
		r1.setVolume(3);
//		r1.search("google");
//각 인터페이스 타입의 메소드만 사용 가능
		
		System.out.println(r1 instanceof RemoteControl);
		System.out.println(r1 instanceof Searchable);
//r1은 RemoteControl타입이지만 SmartTelevision타입의 인스턴스가 담겨있음
//SmartTelevision은 RemoteControl, Searchable 둘 다 구현했으므로
//r1은 RemoteControl, Searchable 둘 다로 형변환 가능
		System.out.println(s1 instanceof Searchable);
		System.out.println(s1 instanceof RemoteControl);
//s1도 r1과 같은 이유로 둘 다로 형변환 가능
		
	}
}
