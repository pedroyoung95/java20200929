package chap14.lecture.api.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx1 {
	public static void main(String[] args) {
		Consumer<Integer> con1 = x -> System.out.println(x * 2);
//Consumer 함수적 인터페이스: 매개값만 존재, 리턴값X(void타입)
		con1.accept(30); // accept(): Consumer인터페이스의 람다식의 실행문을 실행하는 메소드
		
		System.out.println("=====list foreach method=====");
		List<Integer> list = new ArrayList<Integer>();
		list.add(30);
		list.add(70);
		list.add(77);
		list.add(11);
		list.add(33);
		
		list.forEach(con1); //Consumer타입의 변수의 실행문을 실행하는 accept를 list 아이템별로 실행
		
		System.out.println("=====list foreach 2=====");
		
		list.forEach(x -> System.out.println("items : " + x));
//Consumer타입 변수 대신 람다식을 직접 넣어도 됨
		
	}
}
