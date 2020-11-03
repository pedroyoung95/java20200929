package chap14.repeat.api.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerEx {
	public static void main(String[] args) {
		Consumer<Integer> con1 = x -> System.out.println(x * 5);
		con1.accept(3);
		
		System.out.println("=====list=====");
		List<Integer> list = new ArrayList<Integer>(); 
		list.add(5);
		list.add(10);
		list.add(63);
		list.add(34);
		list.add(77);
		
		list.forEach(con1);
		System.out.println("=======");
		list.forEach(x -> System.out.println(x / 5));  
	}
}
