package chap03.binary;

public class CompareOperatorWithRefType {
	public static void main(String[] args) {
		String s = "java";
		String t = "java";
//		s를 통해 java라는 인스터스가 형성
//		t는 기존의 java 인스턴스를 이용(새 인스턴스 형성X)
		
		String u = "ja";
		String v = "va";
		String w = u + v;
//		w는 연산에 의한 java인스턴스를 새로 생성
		
		System.out.println(s);
		System.out.println(t);
		System.out.println(w);
		
		System.out.println(s == t);
		System.out.println(s == w);
//		s, t와 w는 서로 다른 인스턴스를 참조
	}
}
