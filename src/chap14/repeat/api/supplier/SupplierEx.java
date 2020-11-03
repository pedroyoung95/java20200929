package chap14.repeat.api.supplier;

import java.util.HashSet;
import java.util.Set;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierEx {
	public static void main(String[] args) {
		Supplier<Integer> s1 = () -> (int)(Math.random()*10+1);
		IntSupplier s2 = () -> (int)(Math.random()*45+1);
		System.out.println(s1.get());
		
		Set<Integer> lotto = new HashSet<Integer>();
		for(int i = 0; i < 6; i++) {
			lotto.add(s2.getAsInt());
		}
		for(Integer num : lotto) {
			System.out.println(num);
		}
	}
}
