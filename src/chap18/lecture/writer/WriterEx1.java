package chap18.lecture.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterEx1 {
	public static void main(String[] args) throws Exception {
		
		String path= "writer.txt";
		Writer writer = new FileWriter(path);
		
		writer.write('한'); 
//write()는 파라미터로 int 값이나 char타입 문자 한 개 둘 다 받을 수 있음
//int 값 파라미터 -> 파일의 int값에서 끝에있는 한 개의 문자 출력
//char타입 문자 한 개 파라미터 -> 파라미터 문자 한 개를 출력
		char[] arr = new char[5];
		arr[0] = '자';
		arr[1] = '바';
		arr[2] = '신';
		arr[3] = '용';
		arr[4] = '권';
		
		writer.write(arr);
		writer.write(arr, 2, 3);
		writer.write("\n이것이자바다"); //매개값으로 string을 받으면 문자열을 출력함
		
		writer.close();
	}
}
