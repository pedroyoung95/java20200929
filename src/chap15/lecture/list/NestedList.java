package chap15.lecture.list;

import java.util.ArrayList;
import java.util.List;

public class NestedList {
	public static void main(String[] args) {
		List<String> subList1 = new ArrayList<>();		
		subList1.add("val1_1");
		subList1.add("val1_2");
		subList1.add("val1_3");
		
		List<String> subList2 = new ArrayList<>();
		subList2.add("val2_1");
		subList2.add("val2_2");
		subList2.add("val2_3");
		
		List<List<String>> superList = new ArrayList<>();
		superList.add(subList1);
		superList.add(subList2);
		
		List<String> getSub1List = superList.get(1);
		String getSub1List_value = superList.get(1).get(1);
		System.out.println(getSub1List);
		System.out.println(getSub1List_value);
		
		System.out.println("subList1 size: " + subList1.size());
		System.out.println("subList2 size: " + subList2.size());
		System.out.println("superList size: " + superList.size());
		
		
	}

}
