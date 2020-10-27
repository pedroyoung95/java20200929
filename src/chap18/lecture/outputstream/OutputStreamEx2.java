package chap18.lecture.outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class OutputStreamEx2 {
	public static void main(String[] args) throws Exception {
		String source = "Bayern.jpg";
		String copy = "Bayern-copy.jpg";
		
		InputStream is = new FileInputStream(source);
		OutputStream os = new FileOutputStream(copy);
		
		int readByte = 0;
		while((readByte = is.read())!=-1) {
			os.write(readByte);
		} 
		System.out.println("복사완료");
		
		is.close();
		os.close();
	}
}
