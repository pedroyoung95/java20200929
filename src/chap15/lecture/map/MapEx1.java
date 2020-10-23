package chap15.lecture.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
	public static void main(String[] args) {
		//(Key, Value)로 이루어진 두 값의 쌍인 Entry를 저장
		//Entry의 순서는 정해져 있지 않음
		//다른 언어에서의 dictionary
		
		Map<Integer, String> map = new HashMap<>();
		
		//추가
		map.put(100, "kim");
		map.put(30, "hong");
		map.put(22, "lee");
		map.put(11, "choi");
		map.put(200, "jin");
		
		System.out.println(map.size());
		
		//수정
		map.put(200, "park"); //중복된 키의 경우, 가장 최근의 값으로 덮어 씌워짐
		System.out.println(map.size());
		
		//검색: 키를 이용해 값을 찾음
		String v1 = map.get(100); //get메소드 안에 키 값을 파라미터로 넣으면 그 키의 값이 리턴됨
		System.out.println(v1);
		System.out.println(map.get(200));
		
		//삭제: 키를 이용해 값을 찾아서 지움(값을 지우면 그 키도 같이 삭제)
		map.remove(200);
		System.out.println(map.size());
		
		//전체 탐색 방법1. 키만 Set컬렉션으로 만들어서 값 리턴
		System.out.println("Iterator로 탐색");
		Set<Integer> keySet = map.keySet(); //단계1.여러 키를 하나의 Set으로 만듬
		Iterator<Integer> keyIterator = keySet.iterator(); //단계2.Iterator 또는 for로 키Set 전체 탐색
		while(keyIterator.hasNext()) { //단계3.전체 탐색하면서 각 키의 값을 리턴
			Integer key= keyIterator.next();
			System.out.println(key + " : " + map.get(key));
		}
		
		System.out.println("향상된 for문으로 탐색");
		Set<Integer> keySet2 = map.keySet(); 
		for(Integer key : keySet) {
			System.out.println(key + " : " + map.get(key));
		}
		System.out.println();
		
		//전체 탐색 방법2. 키와 값의 쌍 Entry 자체를 Set컬렉션으로 만들어서 키와 값 리턴
		System.out.println("Entry 전체를 꺼내서 탐색, Iterator 사용");
		Set<Map.Entry<Integer, String>> entrySet1 = map.entrySet();
		Iterator<Map.Entry<Integer, String>> entryIterator = entrySet1.iterator();
		while(entryIterator.hasNext()) {
//			Integer getKey = entryIterator.next().getKey();
//			String getValue = entryIterator.next().getValue();
//next()가 실행되면 그 다음 요소로 넘아가므로 
//두 번 쓰면 다음 요소의 값을 물어보게 되어서 entry가 2번 밖에 안 나옴
			Map.Entry<Integer, String> entry = entryIterator.next();
			Integer getKey = entry.getKey();
			String getValue = entry.getValue();
			System.out.println(getKey + " : " + getValue);
		}
		
		System.out.println("Entry 전체를 꺼내서 탐색, 향상된 for문 사용");
		Set<Map.Entry<Integer, String>> entrySet2 = map.entrySet();
		for(Map.Entry<Integer, String> entry : entrySet2) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
