package chap07.lecture.instanceofOperation;

public class MyApp {
	public static void main(String[] args) {
		SuperClass o1 = new SubClass();
		
		//instanceOf: 좌항이 참조변수, 우항이 타입
		//좌항(변수) instanceOf 우항(타입)
		//결과값: boolean 타입
				
		
		System.out.println(o1 instanceof SuperClass);
		System.out.println(o1 instanceof SubClass);
		System.out.println(o1 instanceof SubClass2);
		
		if(o1 instanceof SubClass) {
			SubClass o2 = (SubClass) o1;
		}
		
		if(o1 instanceof SubClass2) {
			SubClass2 o3 = (SubClass2) o1;
//SubClass2도 SuperClass의 자식클래스이므로 o1을 SubClass2로 강제형변환 가능
		}
		


		
		
	}
}
