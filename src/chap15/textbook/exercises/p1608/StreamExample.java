package chap15.textbook.exercises.p1608;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamExample {
	static class Member {
		private String name;
		private String job;

		public Member(String name, String job) {
			super();
			this.name = name;
			this.job = job;
		}

		public String getName() {
			return name;
		}

		public String getJob() {
			return job;
		}
	}
	
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자")
				);

		Map<String, List<String>> groupingMap = new HashMap<>();
		// 작성위치
		List<String> developerName = new ArrayList<String>();
		List<String> designerName = new ArrayList<String>();
//		for(int i = 0; i <list.size(); i++) {
//			if(list.get(i).getJob().equals("개발자")) {
//				developerName.add(list.get(i).getName());
//				groupingMap.put("개발자", developerName);
//			} else if(list.get(i).getJob().equals("디자이너")) {
//				designerName.add(list.get(i).getName());
//				groupingMap.put("디자이너", designerName);
//			}
//		}		
		for(Member member : list) {
			if(member.getJob().equals("개발자")) {
				developerName.add(member.getName());
				groupingMap.put("개발자", developerName);
			} else if(member.getJob().equals("디자이너")) {
				designerName.add(member.getName());
				groupingMap.put("디자이너", designerName);
			}
		}
		
		// 출력
		List<String> developers = groupingMap.get("개발자");
		List<String> designers = groupingMap.get("디자이너");
		
		System.out.print("[개발자]");
		for (String name : developers) {
			System.out.print(" " + name);
		}
		System.out.println();
		
		System.out.print("[디자이너]");
		for (String name : designers) {
			System.out.print(" " + name);
		}
	}

}











