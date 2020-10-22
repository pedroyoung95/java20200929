package chap13.textbook.s130402;

public class Util {
	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}
}
//Util클래스의 용도: compare 메소드 사용
//compare메소드의 기능: 두 클래스타입 파라미터의 Key필드값, value필드값 비교
//두 필드값의 객체가 같은지 비교(equals메소드)
//key필드값과 value필드값 둘 다 equals비교 결과가 true일 경우 true리턴
//요약: Util클래스의 compare메소드를 통해 두 파라미터의 key, value값 비교
