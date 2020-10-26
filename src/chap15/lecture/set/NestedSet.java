package chap15.lecture.set;

import java.util.HashSet;
import java.util.Set;

public class NestedSet {
	public static void main(String[] args) {
		Set<Integer> subSet1 = new HashSet<>();
		subSet1.add(1);
		subSet1.add(2);
		subSet1.add(3);
		
		Set<Integer> subSet2 = new HashSet<>();
		subSet2.add(-1);
		subSet2.add(-2);
		subSet2.add(-3);
		
		Set<Set<Integer>> superSet = new HashSet<>();
		superSet.add(subSet1);
		superSet.add(subSet2);
		System.out.println("superSet size: " + superSet.size());
		
		for(Set<Integer> subSet : superSet) {
			System.out.println(subSet);
//			Set<Integer> getSubSet = subSet;
		}
		for(Integer subSet1Val : subSet1) {
			System.out.println(subSet1Val);
		}
		for(Integer subSet2Val : subSet2) {
			System.out.println(subSet2Val);
		}
	}
}
