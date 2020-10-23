package chap15.textbook.s150202;

import java.util.*;

public class VectorExample {
	public static void main(String[] args) {
		
		List<Board> list = new Vector<Board>();
//Vector: ArrayList와 기능상 차이X
//스레드 실행시의 문제를 ArrayList보다 줄여주는 정도. 대부분의 경우 ArrayList를 더 많이 사용
		
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이3"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		list.remove(2);
		list.remove(3);
		
		for(Board board : list) {
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
		
	}
}
