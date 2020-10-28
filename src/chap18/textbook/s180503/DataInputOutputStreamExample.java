package chap18.textbook.s180503;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DataInputOutputStreamExample {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("primitive.dat");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("홍길동");
		dos.writeDouble(95.5);
		dos.writeInt(1);
		
		dos.writeUTF("김자바");
		dos.writeDouble(90.3);
		dos.writeInt(2);
		
		dos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("primitive.dat");
		DataInputStream dis = new DataInputStream(fis);
		
		for(int i = 0; i < 2; i++) {
			String name = dis.readUTF();
			double score = dis.readDouble();
			int order = dis.readInt();
//출력한 순서대로 읽어야 함.
			System.out.println(name + " : " + score + " : " + order);
		}
		
		dis.close();
		fis.close();
		
	}
}
