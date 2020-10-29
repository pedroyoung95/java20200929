package chap14.lecture.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Sample1 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		
		names.add("java");
		names.add("html");
		names.add("css");
		names.add("jsp");
		names.add("servlet");
		
		Consumer<String> o1 = (s) -> {System.out.println(s);};
//forEach의 파라미터는 Consumer타입, Consumer는 @FuntionalInteface이므로 람다식 사용 가능
//Consumer의 제네릭 타입은 forEach가 받는 요소의 타입과 동일해야 함
		names.forEach(o1);
		names.forEach((s) -> System.out.println(s));
//forEach메소드는 names에 있는 요소를 하나씩 꺼내서 람다식에 넣어서 실행
	}
}
