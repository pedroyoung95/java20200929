package chap05;

public class ReferenceType5 {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = new String("java");
		
		str2 = null;
//null 값을 넣으면, 객체를 참조하지 않게 됨
//str2에는 저장된 주소 값이 사라지고, null이라는 키워드가 저장 됨
//새로 생성된 java가 들어있는 객체는 
//jvm이 불필요한 인스턴스를 모아 제거하는 garbage collector에 의해 버려짐
		
	}
}
