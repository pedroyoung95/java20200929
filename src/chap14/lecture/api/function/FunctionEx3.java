package chap14.lecture.api.function;

import java.util.HashMap;
import java.util.Map;

public class FunctionEx3 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.compute(key, remappingFunction);
//compute(): 첫 번째 파라미터는 key
//두 번째 파라미터는 BiFunction 인터페이스
//BiFunction인터페이스의 람다식의 결과값을 key의 새로운 값으로 할당하게 됨
//map.put(k, v)에서 새로 넣을 값이 람다식인 형태
	}
}
