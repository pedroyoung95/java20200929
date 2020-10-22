package chap11.textbook.s110601;

import chap06.textbook.s060802.Car;

public class ClassExample {
	public static void main(String[] args) {
		Car car = new Car();
		Class clazz1 = car.getClass();
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		
		try {
			Class clazz2 = Class.forName("chap06.textbook.s060802.Car");
//존재하는 패키지가 포함된 Car클래스의 전체 이름을 
//forName()에 넣어야 clazz2의 Class객체를 리턴			
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
