package chap14.lecture.api.function;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class FunctionEx2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("java", 20);
		map.put("html", 55);
		map.put("css", 2);
		map.put("jquery", 1);
		map.put("dbms", 7);
		map.put("mysql", 99);
		
		map.replaceAll((k, v) -> v * 2); 
//함수적 인터페이스가 파라미터면, 람다식을 바로 넣어서 사용	
//매개값이 2개 이상이여도 하나의 매개값만 리턴값에 담아도 됨
		map.forEach((k, v) -> System.out.println(k + ":" + v));
		
	}
}
