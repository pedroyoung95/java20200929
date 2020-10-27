//한글
package chap18.lecture.filterstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderEx1 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/lecture/filterstream/InputStreamReaderEx1.java";
		InputStream is = new FileInputStream(path);
		InputStreamReader isr = new InputStreamReader(is);
		Reader isr2 = new InputStreamReader(is);
//보조스트림이 변환할 스트림을 매개값으로 받음
//보조스트림 변수의 클래스 타입은 최종 변환되는 상위 클래스(Reader)타입도 가능
//		System.out.println((char)is.read());
//		System.out.println((char)is.read());
//		System.out.println((char)is.read());
		
		System.out.println((char)isr.read());
		System.out.println((char)isr.read());
		System.out.println((char)isr.read());
		
		
		is.close();
		isr.close();
	}
}
