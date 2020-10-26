package chap15.textbook.exercises.p09;

import java.util.*;
import java.util.Map.Entry;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
//		
//		Set<String> keySet = map.keySet();
//		for(String key : keySet) {
//			totalScore += map.get(key);
//			maxScore = Math.max(maxScore, map.get(key));
//			if(map.get(key)==maxScore) {
//				name = key;
//			}
//		}		
//		int avg = totalScore / map.size();
		
		Set<Map.Entry<String, Integer>> mapEntry = map.entrySet(); 
		for(Map.Entry<String, Integer> entry : mapEntry) {
			totalScore += entry.getValue();
			maxScore = Math.max(maxScore, entry.getValue());
			if(entry.getValue()==maxScore) {
				name = entry.getKey();
			}
		}
		int avg = totalScore / map.size();
		
		
		System.out.println("평균점수: " + avg);
		System.out.println("최고점수: " + maxScore);
		System.out.println("최고점수를 받은 아이디: " + name);
	}
}
