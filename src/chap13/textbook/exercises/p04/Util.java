package chap13.textbook.exercises.p04;

public class Util {
	public static <K, V> V getValue(Pair<K, V> pair, K key) {
		if(key.equals(pair.getKey())) {			
			return pair.getValue();
		} else {
			return null;
		}
	}
}
