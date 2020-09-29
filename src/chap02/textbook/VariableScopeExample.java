package chap02.textbook;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2 = v1 - 10;
			int v3 = v1 + v2+ 5;
			System.out.println(v2);
			System.out.println(v3);
		}
//		int v3 = v1 + v2+ 5; //v2는 if 블록 안에서만 사용가능
	}
}
