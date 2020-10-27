package chap18.lecture.dataInputRepeat;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class BufferedReaderEx {
	public static void main(String[] args) throws Exception {
		Reader r = new FileReader("src/chap18/lecture/dataInputRepeat/BufferedReaderEx.java");
		BufferedReader br = new BufferedReader(r);
		
		int lineCnt = 0;
		String readString;
		while((readString=br.readLine()) != null) {
			lineCnt++;
			System.out.println(lineCnt + ": " + readString);
		}
		br.close();
		r.close();
		
	}
}
