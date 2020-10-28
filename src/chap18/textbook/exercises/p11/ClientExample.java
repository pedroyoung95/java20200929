package chap18.textbook.exercises.p11;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("172.30.1.6", 5001);
//IP주소와 포트 번호를 갖고 바로 Socket 객체를 만들면 해당 서버로 바로 접속(connect할 필요X)
		OutputStream os = socket.getOutputStream();
		
		String filePath = "C:\\Users\\admin\\Documents\\myworkspace\\eclipse-workspace\\myjava\\Bayern.jpg";
		File file = new File(filePath);
		
		String fileName = file.getName();
		
		byte[] bytes = new byte[100];
		fileName.getBytes(0, fileName.length(), bytes, 0);
		os.write(bytes);
		
		System.out.println("[파일 보내기 시작] " + fileName);		
		FileInputStream fis = new FileInputStream(file);
		int readCnt;
		while((readCnt = fis.read(bytes)) != -1) {
			os.write(bytes);
		}
		
		os.flush();
		System.out.println("[파일 보내기 완료]");
		
		fis.close();
		os.close();
		socket.close();
	}
}
