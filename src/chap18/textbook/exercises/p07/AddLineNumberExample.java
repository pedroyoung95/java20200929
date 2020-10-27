package chap18.textbook.exercises.p07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		String filePath = "src/chap18/textbook/exercises/p07/AddlineNumberExample.java";
		
		Reader is = new FileReader(filePath);
		BufferedReader bis = new BufferedReader(is);
		
		int lineCount = 0;
		String line; 
//readLine()메소드도 실행될 때마다 줄을 읽어버려서 while판별식에서 한 번, 출력문에서 또 한 번 기입하면
//두 줄을 읽은 상태에서 출력됨(띄엄띄엄 출력)
//read 관련 메소드를 반복하지 않도록 변수에 담아야 함
		while((line = bis.readLine()) != null) {
			lineCount++;
			System.out.println(lineCount + ": " + line);
		}
		//닫는 순서는 연 순서 반대로(나중에 연 것 부터 닫기)
		bis.close();
		is.close();
		
//		System.out.println(os);
		
	}
}
