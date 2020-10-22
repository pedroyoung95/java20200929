package chap11.textbook.s110603;

public class NewInstanceExample {
	public static void main(String[] args) {
		try {
//			Class clazz = Class.forName("chap11.textbook.s110603.SendAction");
			Class clazz = Class.forName("chap11.textbook.s110603.ReceiveAction");
			Action action = (Action) clazz.newInstance();
//newInstance(): 실행 주체 클래스 타입의 변수의 인스턴스를 생성
//newInstance()는 Object 타입을 리턴하기 때문에
//모든 Object가 Action 인터페이스를 갖고있지 않으므로 강제 형변환 필요
			action.execute();
		} catch (ClassNotFoundException e) {
			//forName()메소드가 throws 하는 예외 처리 부분
			e.printStackTrace();
		} catch (InstantiationException e) {
			//newInstance()메소드가 throws 하는 예외 처리 부분
			e.printStackTrace();
		} catch(IllegalAccessException e) {
			//newInstance()메소드가 throws 하는 예외 처리 부분
			e.printStackTrace();
		}
	}
}
