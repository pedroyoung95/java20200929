package chap18.serverRepeat;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestClientEx {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("192.168.0.113", 5001);	
		String makeFile = "";
		OutputStream os = socket.getOutputStream();
		
		String filePath = "C:\\Users\\admin\\Documents\\myworkspace\\eclipse-workspace\\myjava\\Bayern.jpg";
		File file = new File(filePath);
		
		FileInputStream fis = new FileInputStream(file);
		int readCnt;
		while((readCnt = fis.read()) != -1) {
			os.write(readCnt);
		}
	}
}
