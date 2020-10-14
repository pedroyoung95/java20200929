package chap06.lecture.packageKeyword;

import java.util.Scanner;
//import로 패키지를 가져오면 패키지 이름을 매번 쓰지 않아도 됨
import java.util.*;//(*을 쓰면 java.util 패키지 안 모든 클래스를 불러옴)

//import java.lang.String;

public class MyApp {
	public static void main(String[] args) {
		chap06.lecture.packageKeyword.MyClass o1 = new chap06.lecture.packageKeyword.MyClass();
		
		MyClass o2 = new MyClass();
//o1과 o2는 같은 패키지 안에 있는 클래스를 공유하므로 패키지 이름 생략 가능
		
		chap06.lecture.MyClass o3 = new chap06.lecture.MyClass();
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
//java.util 안에 있는 Scanner 클래스를 사용
		Scanner s2 = new Scanner(System.in);
		
		java.lang.String str = "java";
		String str2 = "css";
//java.lang 안에 있는 클래스들은 import 생략 가능
		
		ArrayList list = new ArrayList();
		
	}
}
