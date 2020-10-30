package chap14.lecture.api.predicate;

import java.util.function.Predicate;

public class PredicateEx1 {
	public static void main(String[] args) {
		Predicate<Integer> isEven = x -> x % 2 == 0;
		Predicate<Integer> isOdd = x -> x % 2 == 1;
		
		System.out.println(isEven.test(55));
		System.out.println(isOdd.test(33));
	}
}
