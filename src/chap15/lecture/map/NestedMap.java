package chap15.lecture.map;

import java.util.HashMap;
import java.util.Map;

public class NestedMap {
	public static void main(String[] args) {
		Map<String, Integer> apart105_1_2 = new HashMap<>();
//		apart105_1_2.put("password101", 101);
//		apart105_1_2.put("password201", 201);
//		apart105_1_2.put("password202", 202);
		for(int i = 1; i <= 29; i++) {
			apart105_1_2.put("password"+i+"01", i*100+1);
		}
		for(int i = 1; i <= 29; i++) {
			apart105_1_2.put("password"+i+"02", i*100+2);
		}
		
		Map<String, Integer> apart105_3_4 = new HashMap<>();
//		apart105_3_4.put("password303", 303);
//		apart105_3_4.put("password304", 304);
//		apart105_3_4.put("password403", 403);
		for(int i = 1; i <= 29; i++) {
			apart105_3_4.put("password"+i+"03", i*100+3);
		}
		for(int i = 1; i <= 29; i++) {
			apart105_3_4.put("password"+i+"04", i*100+4);
		}
		
		Map<String, Map<String, Integer>> superMap = new HashMap<>();
		superMap.put("apart105_1_2", apart105_1_2);
		superMap.put("apart105_3_4", apart105_3_4);
		
		Map<String, Integer> apart105_1_2Key = superMap.get("apart105_1_2");
		Integer homeNumOf105_1_2 = apart105_1_2Key.get("password1001");
		System.out.println(homeNumOf105_1_2);
		Map<String, Integer> apart105_3_4Key = superMap.get("apart105_3_4");
		Integer homeNumOf105_3_4 = apart105_3_4Key.get("password304");
		System.out.println(homeNumOf105_3_4);
	}
}
