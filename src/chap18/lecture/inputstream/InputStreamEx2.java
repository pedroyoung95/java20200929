package chap18.lecture.inputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamEx2 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/lecture/inputstream/InputStreamEx2.java";
		InputStream is = new FileInputStream(path);
		
		byte[] datas = new byte[10];
		
		is.read(datas);
//read()의 파라미터로 byte배열을 넣으면 byte배열 길이만큼 읽음
//파일 크기를 byte배열 길이만큼 나눈 값이 read()로 파일을 읽은 횟수가 됨
//read()가 실행될때마다 파일을 읽고, 다른 read()는 읽히지 않은 나머지를 읽게 됨
		int readCount = is.read(datas);
		int loopCount = 0;
		while((readCount = is.read(datas)) != -1 ) {
			loopCount++;
		}
		System.out.println(loopCount);
		
		is.close();
	}
}
