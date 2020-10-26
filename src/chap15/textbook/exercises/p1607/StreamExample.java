package chap15.textbook.exercises.p1607;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		
		List<Member> developers = new ArrayList<>();
		
		// 작성위치
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getJob().equals("개발자")) {
				developers.add(list.get(i));
			}
		}
		
		// 출력
		for (Member member : developers) {
			System.out.println(member.getName());
		}
	}

}







