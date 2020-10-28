package chap18.lecture.dataOutputRepeat;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferedWriterEx {
	public static void main(String[] args) throws Exception {
		String path2 = "src/chap18/lecture/dataOutputRepeat/Test5.txt";
		Writer writer = new FileWriter(path2);
		BufferedWriter bw = new BufferedWriter(writer);
	}
}
