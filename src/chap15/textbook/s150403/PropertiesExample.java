package chap15.textbook.s150403;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Map;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) throws Exception {
		Map<String, String> map; 
//String의 Map을 만들지 말고, Properties 클래스 인스턴스를 바로 만들면 됨
		
		//파일을 읽어서 map에 설정 파일(.properties)의 정보를 저장
		
		Properties properties = new Properties(); //키와 값을 String타입으로 제한한 컬렉션 클래스
		String path = PropertiesExample.class.getResource("database.properties").getPath();
		path = URLDecoder.decode(path, "utf-8");
		properties.load(new FileReader(path)); 
//load메소드의 매개값인 FileReader메소드가 파라미터에 있는 경로를 읽음
//load()메소드를 통해 FileReader가 읽은 파일을 Properties 객체에 넣어서
//'='(등호)를 기준으로 왼쪽을 키(설정명), 오른쪽을 값(설정값)으로 갖는 Map 형식의 객체 생성
		
		System.out.println(properties.size());
//		Object urlValue = properties.get("url"); -> get()메소드는 Object 타입의 값 반환
		String urlValue = properties.getProperty("url"); //getProperty는 String 타입의 값으로 반환
		String driver = properties.getProperty("driver");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		
		System.out.println(driver);
		System.out.println(urlValue);
		System.out.println(username);
		System.out.println(password);
		
	}
}
