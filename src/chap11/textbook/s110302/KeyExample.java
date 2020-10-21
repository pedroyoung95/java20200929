package chap11.textbook.s110302;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
//Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
//HashMap: 다른 인스턴스를 모아서 저장해줄 수 있는 인스턴스
//다른 언어에서 dictionary로 불림
//값과 값의 식별키를 쌍으로 저장
//식별키를 넣으면, 식별키에 연결된 값을 불러올 수 잇음
		
		Key k1 = new Key(1);
		//식별키 "new Key(1)" 로 "홍길동"을 저장함
		hashMap.put(k1, "홍길동");
		
		Key k2 = new Key(1);
		
		//식별키 "new Key(1)" 로 "홍길동"을 읽어옴
		System.out.println(k1.equals(k2));
		System.out.println(k1.hashCode());
		System.out.println(k2.hashCode());
//hashCode() 재정의를 통해 
//k1과 k2 각각의 hashCode()와 equals() 리턴값 동일
		String value = hashMap.get(k2);
//k1과 k2는 완전히 동등한 객체이므로, k2를 넣ㅇ도 k1과 동일한 결과
		System.out.println(value);
	}
}
