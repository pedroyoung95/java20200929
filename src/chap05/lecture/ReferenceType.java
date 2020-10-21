package chap05.lecture;

public class ReferenceType {
	public static void main(String[] args) {
		int i; //메모리에 i라는 이름의 공간 생성
		i=30; //변수 i의 공간에 30이라는 값 저장
		int j=50;
		
		String str; //메모리에 str이라는 이름의 공간 생성 
		str="java";
//		java라는 값이 str 공간이 아닌 새 인스턴스를 생성하고 거기에 저장 
//		인스턴스: 데이터 뭉치로, 객체라고도 함
//		java라는 값이 저장되어있는 객체를 '참조(reference)'
		
		String str2="html";
//		html이 들어있는 인스턴스를 변수str2가 참조
	}
}
