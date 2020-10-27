package chap18.textbook.s180405;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterExample {
	public static void main(String[] args) throws Exception {
		File file = new File("file.txt");
		Writer fw = new FileWriter(file, true);
//두 번째 파라미터가 true이면 기존 파일을 덮어쓰지 않고, 파일 내용 끝에 추가로 쓰여지게 됨 
		fw.write("fileWriter는 한글로된 " + "\r\n");
		fw.write("문자열을 바로 출력할 수 있다." + "\r\n");
		fw.close();
		System.out.println("파일에 저장되었습니다.");
		
	}
}
