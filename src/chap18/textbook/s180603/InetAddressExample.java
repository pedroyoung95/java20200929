package chap18.textbook.s180603;

import java.net.InetAddress;

public class InetAddressExample {
	public static void main(String[] args) {
		try {
			InetAddress local = InetAddress.getLocalHost();//로컬 컴퓨터의 IP주소를 리턴
//IP 주소는 InetAddress 타입
			System.out.println("내컴퓨터 IP주소: " + local.getHostAddress());
//getHostAddress(): 
			
			InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
			for(InetAddress remote : iaArr) {
				System.out.println("www.naver.com IP주소: " + remote.getHostAddress());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
