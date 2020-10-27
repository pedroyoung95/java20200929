package chap18.lecture.dataOutputRepeat;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class OutputStreamWriterEx {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/lecture/dataOutputRepeat/Test3.txt";		
		String path2 = "src/chap18/lecture/dataOutputRepeat/OutputStreamWriterEx.java";
		InputStream is = new FileInputStream(path2);
		InputStreamReader isr = new InputStreamReader(is);
		OutputStream os = new FileOutputStream(path);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		
		os.write(65);
		byte[] arr = new byte[3];
		arr[0] = 66;
		arr[1] = 67;
		arr[2] = 68;
		os.write(arr);
		
		osw.write("\n");
		osw.write("화이팅");
		osw.write("\n");
		
		int readCnt;
		char[] cbuf = new char[100];
		while((readCnt = isr.read(cbuf)) != -1) {
			osw.write(cbuf);
		}
		
		
		osw.close();
		os.close();
		isr.close();
		is.close();
	}
}
