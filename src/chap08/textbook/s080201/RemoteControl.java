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
	
	//default method
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 헤제합니다.");
		}
	}
	
	//static method
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
