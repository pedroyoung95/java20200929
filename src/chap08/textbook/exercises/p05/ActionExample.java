package chap08.textbook.exercises.p05;

public class ActionExample {
	public static void main(String[] args) {
		Action action = new Action() {
			@Override
			public void work() {
				System.out.println("복사를 합니다.");
//Action 인터페이스에 추상메소드가 있으므로 
//익명 객체 포함 특정 객체를 만들 시, 그 메소드를 반드시 재정의
			}
		};				
				
		action.work();
	}
}
