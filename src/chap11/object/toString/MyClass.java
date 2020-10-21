package chap11.object.toString;

public class MyClass {
//Object를 자동으로 상속받기 때문에 extends를 안 해도 됨
	private int age;
	private String name;
	private String password;
	
	public void setFields(int age, String name, String password) {
		this.age = age;
		this.name = name;
		this.password = password;
	}

	@Override
	public String toString() {
		return "MyClass [age=" + age + ", name=" + name + ", password=" + password + "]";
	}
//Source -> Generate toString()
//필드와 메소드의 내용을 출력도록 toString을 재정의
	
	
	
}
