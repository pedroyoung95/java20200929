package chap14.lecture.api.comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ComparatorEx2 {
	public static void main(String[] args) {
		
		Random random = new Random();
		List<Member> list = new ArrayList<Member>();
				
		for(int i = 0; i < 10; i++) {
			list.add(new Member(random.nextInt(100), "java"));
		}
		
		list.sort((x, y) -> x.getId() - y.getId()); 
//람다식의 매개값은 list의 요소인 Member클래스이므로, Member클래스의 메소드 사용 가능 
		
		list.forEach(e -> System.out.println(e));
	}
}
