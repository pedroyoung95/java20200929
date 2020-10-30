package chap14.lecture.api.supplier;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierEx1 {
	public static void main(String[] args) {
		Supplier<Double> nextDouble = () -> Math.random();
		DoubleSupplier nextDouble2 = () -> Math.random();
//매개 변수X, 리턴값만 존재. 타입파라미터는 리턴값의 타입을 결정
//(리턴타입)Supplier: 리턴타입이 Supplier앞에 붙으면 그 리턴타입으로 결정
		System.out.println(nextDouble.get()); //get()메소드를 사용해 리턴값 공급
		Supplier<Integer> nextLottoBall = () -> (int)(Math.random() * 45 + 1);
		IntSupplier nextLottoBall2 = () -> (int)(Math.random() * 45 + 1);
		
		for(int i = 0; i < 6; i++) {
			System.out.println(nextDouble.get());
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.println(nextLottoBall.get());
		}
	}
}
