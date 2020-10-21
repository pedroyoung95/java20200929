package chap11.textbook.s110303;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		String strobj = myPhone.toString();
		System.out.println(strobj);
		System.out.println(myPhone);
//객체를 받으면 자동으로 toString()의 값(문자정보)을 출력하므로,
//객체의 toString()메소드를 실행한 값을 변수에 담아서 출력하는 것과 동일
	}
}
