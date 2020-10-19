package chap08.textbook.s080302;

import chap08.textbook.s080201.RemoteControl;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {}

			@Override
			public void turnOff() {}

			@Override
			public void setVolume(int volume) {}
			
			public void search() {}
			
		};
		rc.turnOff();
		rc.turnOn();
		rc.setVolume(3);
//		rc.search(); 
// 익명 객체 안 새로 선언된 메소드는 익명 객체 안에서만 사용
		
	}
}
