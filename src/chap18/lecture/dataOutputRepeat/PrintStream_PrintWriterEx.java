package chap18.lecture.dataOutputRepeat;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class PrintStream_PrintWriterEx {
	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("src\\chap18\\lecture\\dataOutputRepeat\\Test_printStream.txt");
		PrintStream ps = new PrintStream(os);
		
		ps.print(true);
		ps.println();
		ps.println("파라미터에 적힌 것을 문자 그대로 출력");
		ps.printf("printf 사용 방법: %2$s %1$s ", "format방법과 유사", "python의 문자열에서의");
		
	}
}
