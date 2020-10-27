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
		while(bis.readLine() != null) {
			lineCount++;
			System.out.println(lineCount + ": " + bis.readLine());
		}
		//닫는 순서는 연 순서 반대로(나중에 연 것 부터 닫기)
		bis.close();
		is.close();
		
//		System.out.println(os);
		
	}
}
