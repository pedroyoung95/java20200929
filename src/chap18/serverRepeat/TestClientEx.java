package chap18.serverRepeat;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestClientEx {
	public static void main(String[] args) throws Exception {
		System.out.println("[연결 시도]");
		Socket socket = new Socket("localhost", 5001);
		System.out.println("[연결 성공]");
		OutputStream os = socket.getOutputStream();
		
		String filePath = "C:\\Users\\admin\\Documents\\myworkspace\\eclipse-workspace\\myjava\\Dortmund.jpg";
		File file = new File(filePath);
		
		FileInputStream fis = new FileInputStream(file);
		int readCnt;
		while((readCnt = fis.read()) != -1) {
			os.write(readCnt);
		}
		fis.close();
		os.close();
		socket.close();
	}
}
