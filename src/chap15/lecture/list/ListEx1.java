package chap15.lecture.list;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.ls.LSInput;

public class ListEx1 {
	public static void main(String[] args) {
		//순서가 있고, 중복된 값 저장 가능
		List<String> list = new ArrayList<>();
//저장할 값의 타입에 따른 제네릭 타입 파라미터로 지정해줘야 함
//배열 형태로 만들어줘야 해서, new ArrayList<> ()로 작성
		
		//추가 
		list.add("java");
		list.add("html");
		list.add("css");
		list.add(3, "java");//인덱스번호도 적어서 특정 인덱스번호에 추가 가능
		
		System.out.println(list.size()); //size(): ArrayList의 전체 배열 크기를 리턴
		
		//검색
		System.out.println(list.get(1));
		System.out.println(list.get(3)); //get(index번호): 주어진 인덱스 번호의 값을 리턴
		
		//수정
		list.set(3, "jsp"); //set(index번호, 새로 넣을 값): 주어진 번호에 새 값을 넣음
		
		//삭제
		list.remove(2); //remove(index번호): 주어진 번호의 값을 지움
		System.out.println(list.size()); //빈 공간은 사라지고 한 칸씩 땡김(전체 크기가 3으로 줄어듬)
		
		//모든 요소 탐색
		for(int i  = 0; i <list.size(); i++) {
			System.out.println(list.get(i));
		}
		for(String e : list) {
			System.out.println(e);
		}
		
		List<Integer> listInt = new ArrayList<>();
		list.add("servlet");
		listInt.add(4);
		List listNotype = new ArrayList();//예전 코드 중에는 타입이 없는 경우도 있음. Object타입을 받음
		listNotype.add("string");
		listNotype.add(3); //Object는 최상위 부모이기 때문에, 모든 타입을 받을 수 있음
		
		Object o1 = listNotype.get(0);
		Object o2 = listNotype.get(1); //단, 요소를 꺼내서 사용 시, casting이 필요하게 됨
		
	}
}
