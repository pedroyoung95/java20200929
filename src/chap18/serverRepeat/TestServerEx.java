package chap18.serverRepeat;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServerEx {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("localhost", 5001));
		
		System.out.println("[서버 시작]");
				
		while(true) {
			try {
				Socket socket = serverSocket.accept();
				InputStream is = socket.getInputStream();
				OutputStream os = new FileOutputStream("C:/Users/admin/Desktop/Dortmund.jpg");
				System.out.println("[파일 전송 시작]");
				int readCnt;
				while((readCnt = is.read()) != -1) {
					os.write(readCnt);
				}
				System.out.println("[파일 전송 완료]");
				
				os.close();
				is.close();
				socket.close();
				
			} catch (Exception e) {
				e.printStackTrace();
				break;
			}
		}
		serverSocket.close();
		System.out.println("[서버 종료]");
	}
}
