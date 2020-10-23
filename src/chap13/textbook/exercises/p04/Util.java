package chap13.textbook.exercises.p04;

public class Util {
	public static <K, V> V getValue(Pair<K, V> pair, K key) {
//제네릭 타입 파라미터 자체를 리턴타입으로 사용 가능
		if(key.equals(pair.getKey())) {			
			return pair.getValue();
		} else {
			return null;
		}
	}
}
