package chap18.lecture.dataInputRepeat;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class BufferedInputStreamEx {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/lecture/filterstream/01. 기본 타입과 참조 타입의 차이.png";
		FileInputStream is = new FileInputStream(path);
		BufferedInputStream bis = new BufferedInputStream(is);
//버퍼라는 메모리를 이용해서 하드디스크로부터 데이터를 모아두다가 일정량 이상이 되면 입력받아서 읽음
//더 빠른 처리 속도
		long start = System.currentTimeMillis();
		
		while(bis.read() != -1) {
			
		}
//		while(is.read() != -1) {
//			
//		}
//		
		long end = System.currentTimeMillis();
		System.out.println("총 걸린 시간: " + (end-start) + "ms");
	}
}
