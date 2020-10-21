package chap05.lecture.enumType;

public class EnumTypeEx2 {
	public static void main(String[] args) {
		MyEnum e1 = MyEnum.MY_VALUE4;
		System.out.println(e1.name());
//name(): 열거 객체가 갖고있는 문자열 리턴
//리턴되는 문자열이 열거 타입 변수의 이름과 동일
		System.out.println(e1.ordinal());
//ordinal(): 전체 열거 객체 중 몇 번째인지 인덱스 번호로 리턴
		MyEnum e2 = MyEnum.valueOf("VALUE3");
//valueOf(): 매개값의 문자열과동일한 문자열을 가지는 열거 객체를 리턴
		System.out.println(e2.name());
		
		int diff = e1.compareTo(e2);
//compareTo(): 매개값인 열거 객체를 기준으로 몇 번째 위치하는지 비교
//매개값 열거 객체보다 먼저->음수
//매개값 열거 객체보다 뒤->양수
		System.out.println(diff);		
		System.out.println(e2.compareTo(e1));
		
		MyEnum[] arr = MyEnum.values(); //열거 객체들을 배열로 리턴함
		System.out.println(arr.length);
		
	}
}
