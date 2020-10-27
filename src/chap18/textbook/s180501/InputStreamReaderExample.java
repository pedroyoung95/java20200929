package chap18.textbook.s180501;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
//System.in: 키보드로 입력한 값을 byte로 받음
//알파벳은 1글자가 1byte이므로 reader로 변환필요X
//한글은 1글자가 1byte를 넘어가므로, 문자열로 받기 위해 InputStream을 Reader로 변환해줘야 함
		
		int readCharNo;
		char[] cbuf = new char[100];
		while((readCharNo = reader.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
		reader.close();
	}
}
