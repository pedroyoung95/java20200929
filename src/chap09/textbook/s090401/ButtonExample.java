package chap09.textbook.s090401;

public class ButtonExample {
	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListener(new CallListener());
//인터페이스 타입 필드 값에 CallListener의 인스턴스를 할당
		btn.touch();
//touch메소드는 필드값의 onClick 메소드를 실행
//그런데, 필드 값이 CallListener의 인스턴스이므로 
//CallListener의 인스턴스의 메소드가 실행
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
	}
}
