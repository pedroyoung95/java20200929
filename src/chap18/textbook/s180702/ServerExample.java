package chap18.textbook.s180702;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("172.30.1.6", 5001));
//bind(): 컴퓨터에 포트를 여는 메소드
//InetSocketAddress에 두 번째 매개 값: 포트 번호
//포트 번호: 컴퓨터에서 실행되는 앱의 주소 역할
//IP를 통해 컴퓨터에 접근 후, 컴퓨터의 특정 앱에 접근하기 위해 필요
			while(true) {
				System.out.println("[연결 기다림]");
				Socket socket = serverSocket.accept();
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("[연결 수락함]" + isa.getHostName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (Exception e) {}
		}
		
	}
}
