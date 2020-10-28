package chap18.textbook.s180505;

import java.io.Serializable;

public class ClassA implements Serializable{
	static final long serialVersionUID = 1L;
//같은 클래스임을 증명하는 식별자
//클래스 내용이 변경되면 serialVersionUID가 변경되면서 객체를 그 클래스에 담을 수 없게 됨
//클래스 변경이 있어도 명시적으로 선언된 UID값이 같으므로 객체를 담을 수 있게 됨으로써 직렬화 가능
//Serializable이 구현되어야 객체 입출력 가능
//인스턴스 필드가 직렬화 가능
	int field1;
	ClassB field2 = new ClassB();
//static이나 transient 키워드가 붙은 필드를 제외한 모든 필드가 직렬화 가능(serializable)
	static int field3;
	transient int field4;
}
