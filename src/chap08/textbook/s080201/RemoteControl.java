package chap08.textbook.s080201;

public interface RemoteControl {
	//static final field
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
//인터페이스의 필드는 static final field, 즉 상수여야 함.
//필드 앞에 'public static final'이 생략됨.
	
	//abstract method
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
//RemoteControl을 구현한 클래스들은 추상메소드를 강제 구현해야 함
	
	//default method
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 헤제합니다.");
		}
	}
//디폴트 메소드 = 추상메소드가 아닌 일반 메소드
//추상이 아니기 때문에 구현 인스턴스에 강제성X
//구현 인스턴스에서 원할 때만 호출 가능
//구현 클래스에서 재정의도 가능함
//public 생략되어있음
	
	//static method
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
//클래스처럼 정적메소드는 인터페이스의 멤버
//객체 없이 인터페이스만으로 호출 가능
//public 생략되어있음
}
