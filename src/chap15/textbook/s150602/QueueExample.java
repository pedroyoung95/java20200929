package chap15.textbook.s150602;

import java.util.*;

public class QueueExample {
	public static void main(String[] args) {
		//FIFO : First In First Out
		Queue<Message> messageQueue = new LinkedList<Message>();
		
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKakaotalk", "홍두께"));
		
		while(!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
//poll(): 가장 나중에 push된 객체를 가져와서 제거(선입선출)
//꺼낸 객체는 message에 들어가고, messageQueue 큐에서 사라짐
			switch(message.command) {
				case "sendMail":
					System.out.println(message.to + "님에게 메일을 보냅니다.");
					break;
				case "sendSMS":
					System.out.println(message.to + "님에게 SMS를 보냅니다.");
					break;
				case "sendKakaotalk":
					System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
					break;
			}
		}
	}
}
