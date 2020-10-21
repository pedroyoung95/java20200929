package chap11.object.hashcode;

public class HashCodeEx1 {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o1.hashCode());
//toString()에 나온 @ 뒤 참조값 만을 10진법으로 바꿔서 출력함.
		System.out.println(o2.hashCode());
		
		System.out.println("-----------------");
		String s1 = "java";
		String s2 = new String("java");
		System.out.println(s1 == s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
//String은 hashcode를 재정의해서 사용하기 때문에, 참조값을 리턴하지 않음
//hashcode를 재정의할 수 있기 때문에 모든 클래스에서 참조값을 리턴하지 않음
//String에서 hashcode는 다른 인스턴스이지만 문자열이 같으면 
//같은 공간에 있고, 그 같은 공간의 값을 리턴함
		System.out.println(s1.equals(s2));
	}
}
