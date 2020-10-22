package chap13.textbook.s130401;

import chap13.textbook.s130202.Box;

public class Util {
	public static <T> Box<T> boxing(T t) {
//앞쪽 <T>는 boxing메소드의 타입 파라미터
//Box<T>는 boxing의 리턴타입인 Box클래스 타입 파라미터
//T가 정해지면 메소드의 타입, Box클래스의 타입이 동시에 결정됨
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
}
