package chap18.textbook.s180505;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class SerializableReader {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		ClassA v = (ClassA) ois.readObject();
		System.out.println("field1: " + v.field1);
		System.out.println("field2.field1: " + v.field2.field1);
//field3, field4는 static 또는 transient가 붙었기 때문에 직렬화불가
//따라서 writeObject안되고, 읽어올 수도 없음
		System.out.println("field3: " + v.field3);
		System.out.println("field4: " + v.field4);
	}
}
