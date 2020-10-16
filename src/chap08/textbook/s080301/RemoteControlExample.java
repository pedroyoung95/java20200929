package chap08.textbook.s080301;

import chap08.textbook.s080201.RemoteControl;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc1 = new Television();
		RemoteControl rc2 = new Audio();
		
		rc1.turnOn();
		rc1.setVolume(5);
		rc1.setVolume(11);
		rc1.setVolume(-1);
		rc1.setMute(true);
		rc1.setMute(false);
		rc1.turnOff();
//상속관계 클래스처럼 인터페이스 구현 인스턴스도 같은 방식으로 메소드 사용
		
		rc2.turnOn();
		rc2.setVolume(5);
		rc2.setVolume(11);
		rc2.setVolume(-1);
		rc2.setMute(true);
		rc2.setMute(false);
		rc2.turnOff();
		
		RemoteControl.changeBattery();
//changeBattery 메소드는 정적메소드이므로
//인스턴스 없이 인터페이스만으로 호출 가능
		
	}
}
