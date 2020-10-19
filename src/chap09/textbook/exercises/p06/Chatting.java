package chap09.textbook.exercises.p06;

public class Chatting {
	void startChat(String chatId) {
		String nickName = chatId;
//익명 객체는 로컬클래스처럼 한 번 사용하고 사라지기 때문에
//지역 변수, parameter가 명시적, 암묵적으로 final이여야 함.
//		nickName = chatId;
		Chat chat = new Chat() {
			@Override
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
				}
			}
		};
		chat.start();
	}
	
	class Chat {
		void start() {}
		void sendMessage(String emssage) {}
	}
}
