package chap10.lecture.autoclose;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AutoCloseEx1 {
	public static void main(String[] args) {
		//old version

		FileInputStream fis = null;
//FileInputStream 타입 변수를 초기 생성
		try {
			fis = new FileInputStream("file.txt");
//읽을 파일을 try블럭 안에서 FileInputStream 타입 변수에 할당			
		} catch (FileNotFoundException e) {
//파일을 찾을 수 없을 때 발생하는 예외를 잡는 catch블럭
			e.printStackTrace();
//printStackTrace(): 예외 발생 코드를 추적해서 콘솔에 출력
		} finally {
			if(fis != null) {
//파일의 참조값을 담은 FileInputStream 타입 변수의 값이 null이 아닐 때
//close가 작동하도록 실행 예외를 잡는 if문 작성
				try {
					fis.close();
//finally 안에 있음으로써, 항상 파일을 닫아줌
				} catch (IOException e) {
//IOException이 체크 예외로 발생하므로 catch블럭을 통해 잡아줌
					e.printStackTrace();
				}
			}
			
		}
		//new version
		//try-with-resources
		//jvm이 알아서 fis2가 null체크하고, 예외도 잡고, close 해줌 
		try(
			FileInputStream fis2 = new FileInputStream("file.txt");
			FileInputStream fis3 = new FileInputStream("file2.txt")
		) {
//try 옆 ()안에 FileInputStream타입 변수에
//읽을 파일을 파라미터로 받는 FileInputStream 인스턴스를 생성해서 할당
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
