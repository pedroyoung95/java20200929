package chap15.lecture.set;

import java.util.HashSet;
import java.util.Set;

public class SetEx2Lotto {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		while(set.size() < 6) {
//중복되어서 set의 크기가 6미만인 경우에는 다시 랜덤숫자를 뽑음
//중복되지 않아서 크기가 6이 되는 경우에 종료되고 출력문 실행
			int num = getNumber();
			set.add(num);
			System.out.println(num);
		}
		
		System.out.println("size: " + set.size());
	}
	
	public static int getNumber() {
		return (int)(Math.random()*45)+1;
	}
}
