package chap14.lecture.api.function;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class FunctionEx3 {
	public static void main(String[] args) throws Exception{
		String path = "src/chap14/lecture/api/function/FunctionEx3.java";
		FileReader fr = new FileReader(path);
		
		Map<Character, Integer> map = new HashMap<>();
		
		int ch;
		
		while((ch = fr.read()) != -1) {
			if(('a' <= ch && ch <='z') || ('A' <= ch && ch <= 'Z')) {
				char c = (char)ch;
				System.out.println(c);				
				map.compute(c, (k, v) -> v == null ? 1 : v + 1);	
//compute(): 첫 번째 파라미터는 key
//두 번째 파라미터는 BiFunction 인터페이스
//BiFunction인터페이스의 람다식의 결과값을 key의 새로운 값으로 할당하게 됨
//map.put(k, v)에서 새로 넣을 값이 람다식인 형태
			}			
		}
		
		map.forEach((k, v) -> System.out.println(k + ":" + v));
		
		fr.close();
	}
}
