package chap05.textbook;

public class EnumMethodExample {
	public static void main(String[] args) {
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말 이군요.");
			} else {
				System.out.println("평일 이군요.");
			}
		}
//args는 main메소드의 파라미터이므로
//Run Configurations의 파라미터를 입력
//이때, args배열의 값이 최종적으로 Week타입에 할당되므로
//Week 타입의 변수를 넣어줘야함
		
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
	}
	
	
}
