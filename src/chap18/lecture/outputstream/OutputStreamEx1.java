package chap18.lecture.outputstream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamEx1 {
	public static void main(String[] args) throws Exception {
		String path = "output.txt";
		OutputStream os = new FileOutputStream(path);
		
		os.write(65); 
//파라미터에 있는 만큼 출력X, '65'의 끝 1바이트만 출력
//char타입 값으로 65는 대문자A에 해당
//파일을 write하게 되면 그 파일이 생성(출력)
		os.write(66);
		
		byte[] datas = new byte[5];
		datas[0] = 67;
		datas[1] = 68;
		datas[2] = 69;
		
		os.write(datas);
		os.write(datas, 0, 2); //write(바이트 배열, 시작 인덱스, 탐색할 길이);
		
		os.close();
	}
}
