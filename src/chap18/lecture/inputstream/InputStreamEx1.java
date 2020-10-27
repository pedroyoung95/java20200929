//한글
package chap18.lecture.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class InputStreamEx1 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/lecture/inputstream/InputStreamEx1.java";
		InputStream is = new FileInputStream(path);
		
		int count = 0;
		int r = 0;
//더 이상 읽을 내용이 없으면 read()는 -1 출력
//read()는 1바이트를 읽어서 4바이트 int타입으로 리턴
		while((r = is.read()) != -1) {
			System.out.print((char) r);
			count++;
		}
		System.out.println(count);
		
		is.close(); //데이터 자원을 꼭 닫아줘야함. 작업은 닫기 전까지 이뤄짐
	}
}
