package chap14.lecture.api.function;

import java.util.function.Function;

public class FunctionEx1 {
	public static void main(String[] args) {
		Function<String, Integer> strToint = s -> Integer.valueOf(s);
//Function<T, R>: T타입의 매개값을 R타입으로 변환해서 리턴. 매개값은 1개
//apply()메소드를 통해 실행
		System.out.println(strToint.apply("30"));
		
		Function<Integer, String> intTostr = i -> String.valueOf(i);
		System.out.println(intTostr.apply(300));
		
	}
}
