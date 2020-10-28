package chap18.serverRepeat;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServerEx {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("192.168.0.113", 5001));
		String path1 = "";
		File file = new File(path1);
		while(true) {
			try {
				Socket socket = serverSocket.accept();
				OutputStream os = socket.getOutputStream();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			serverSocket.close();

		}
	}
}
