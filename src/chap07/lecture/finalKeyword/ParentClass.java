package chap07.lecture.finalKeyword;

public class ParentClass {
	final void method1() {
		System.out.println("parent method1");
	}
//final이 들어가면 이후 override 같은 다른 변경이 불가능
}
