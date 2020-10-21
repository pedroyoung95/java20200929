package chap05.lecture.enumType;

public class EnumTypeEx1 {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		System.out.println(o1 instanceof Object);
		MyEnum e1 = MyEnum.VALUE1;
		MyEnum e2 = MyEnum.MY_VALUE4;
		MyEnum e3 = MyEnum.MY_VALUE4;
//enum 소스 파일 안에서 정해진 인스턴스만 사용 가능
//열거 타입 변수는 열거 '객체'이므로,
//new 연산자 없이 enum이름과 인스턴스이름을 .(dot)으로 연결해서 사용
//※상위 객체 안 하위 객체를 불러내는 방식

		
		System.out.println(e2 == e3);
		System.out.println(e1.toString());
		
		System.out.println(e1 instanceof Object);
		System.out.println(e1 instanceof Enum);
		System.out.println(e1 instanceof MyEnum);
//enum타입 변수는 Object, Enum으로부터 상속받음
//Enum 클래스도 Object를 부모로 두고 있음
//toString()실행하면 객체를 문자열로 표현한 값을 가져오는데
//열거 타입 변수는 열거 '객체'이므로, 열거 객체 이름이 리턴됨
	}
}

class MyClass {}
