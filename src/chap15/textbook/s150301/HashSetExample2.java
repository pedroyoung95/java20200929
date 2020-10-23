package chap15.textbook.s150301;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30)); 
//재정의 된 hashCode와 equals메소드로 인해 동일 객체로 판단되어서 하나만 추가됨
		
		System.out.println("총 객체수: " + set.size());
	}
}
