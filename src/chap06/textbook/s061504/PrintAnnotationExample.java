package chap06.textbook.s061504;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
	public static void main(String[] args) {
		//Service 클래스로부터 메소드 정보 얻기
		Method[] declaredMethods = Service.class.getDeclaredMethods();
//Service클래스의 클래스 객체를 생성하고, 선언된 메소드들을 배열타입에 할당
//Service클래스의 메소드 간에 순서가 정해져 있지 않으므로
//메소드를 읽어서 배열에 넣을 때, 무작위 순으로 들어가게 됨
		
		//Method 객체를 하나씩 처리
		for(Method method : declaredMethods) {
			//PrintAnnotation이 적용되었는지 확인
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				//PrintAnnotation 객체 얻기
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				
				//메소드 이름 얻기
				System.out.println("[" + method.getName() + "]");
				//구분선 출력
				for(int i = 0; i < printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				
				try {
					//메소드 호출
					method.invoke(new Service());
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println();
				}
			} 
		}
	}
}
