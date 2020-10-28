package chap18.textbook.s180505;

import java.io.Serializable;

public class ClassA implements Serializable{
	static final long serialVersionUID = 1L;
//Serializable이 구현되어야 객체 입출력 가능
//인스턴스 필드가 직렬화 가능
	int field1;
	ClassB field2 = new ClassB();
//static이나 transient 키워드가 붙은 필드를 제외한 모든 필드가 직렬화 가능(serializable)
	static int field3;
	transient int field4;
}
