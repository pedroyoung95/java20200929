package chap05.lecture;

public class ReferenceType2 {
	public static void main(String[] args) {
		int i = 30;
		int j = i;
//j는 기본타입이므로, i의 값 30을 직접 저장
		
		String str1 = "java";
		String str2 = str1;
//str1에 의해 java가 저장된 인스턴스 생성, 주소 값을 저장(참조)
//str2는 str1이 갖는 주소 값을 저장(실제 값 저장X)
		System.out.println(i == j);
		System.out.println(str1 == str2);
//str1과 str2의 주소 값이 같으므로 true
		
	}
}
