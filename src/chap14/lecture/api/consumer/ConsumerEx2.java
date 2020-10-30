package chap14.lecture.api.consumer;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ConsumerEx2 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("java", 9);
		map.put("html", 3);
		map.put("css", 5);
		map.put("jsp", 2);
		map.put("servlet", 4);
		map.put("jquery", 3);
		
		map.forEach((k, v) -> System.out.println(k + ":" + v));
//Map은 두 개의 파라미터를 보유 -> 이점을 이용해서 BiConsumer람다식을 사용해 forEach실행
		
		System.out.println("======key set 사용=====");
		Set<String> keySet = map.keySet();
		for(String key : keySet) {
			System.out.println(key + ":" + map.get(key));
		}
	}
}
