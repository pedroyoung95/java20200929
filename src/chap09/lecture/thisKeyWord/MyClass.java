package chap09.lecture.thisKeyWord;

public class MyClass {
	int field1;
	
	class Nested {
		int field1;
		
		void method() {
			int field1 = 3;
			System.out.println(field1);
			System.out.println(this.field1);
//현재 클래스의 멤버 접근 시 this 키워사용
			System.out.println(MyClass.this.field1);
		}
	}
}
