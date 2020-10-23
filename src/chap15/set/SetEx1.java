package chap15.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx1 {
	public static void main(String[] args) {
		//순서가 없고, 중복되지 않음
		Set<String> set = new HashSet<>();
		
		//순서가 없기 때문에, 메소드에서 인덱스번호 사용X
		//추가
		set.add("java");
		set.add("html");
		set.add("css");
		set.add("jsp");
		set.add("dbms");
		set.add(new String("java")); 
//중복된 값은 set에 들어가지 않음
//hashCode와 equals 메소드를 통해 동일한 객체라고 판단되면 추가되지 않음
		
		System.out.println(set.size());
		
		//삭제
		set.remove("jquery"); //없는 요소면 삭제가 이뤄지지 않음
		System.out.println(set.size());
		set.remove(new String("html")); //hashCode와 equals메소드를 통해 동일한 객체라고 판단되면 삭제
		System.out.println(set.size());
		
		//검색(모두 탐색)
		System.out.println("=====향상된 for");
		for(String str : set) {
			System.out.println(str);
//순서가 없기 때문에, 출력하면 넣은 순서와는 다르게 나올 수 있음
		}
		
		Iterator<String> iter = set.iterator();
//		iter.hasNext();
//		iter.next();
		System.out.println("=====Iterator");
		while(iter.hasNext()) {
			String s = iter.next();
			System.out.println(s);
		}
	}
	
	
}
