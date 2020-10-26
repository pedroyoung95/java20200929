package chap15.textbook.s150601;

import java.util.*;

public class StackExample {
	public static void main(String[] args) {
		//LIFO: Last in First out
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(10));
		
		System.out.println(coinBox.get(0).getValue());
		System.out.println(coinBox.get(1).getValue());
		System.out.println(coinBox.get(2).getValue());
		System.out.println(coinBox.get(3).getValue());
		
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop(); 
//pop(): 가장 나중에 push된 객체를 가져와서 제거(후입선출)
//꺼낸 객체는 coin에 들어가고, coinBox 스택에서 사라짐
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
		}
	}
}
