package codeup; //제출 시 패키지 삭제

import java.util.Scanner;

//제출 시 클래스 명 CodeUp1035 -> Main 으로 변경필요!
public class CodeUp1035 {

	public static void main(String[] args){
		String n;
		//Scanner 함수 사용
		Scanner sc = new Scanner(System.in);
		n = sc.next();
		sc.close();

		// 도움 받은 사이즈 -> https://dpdpwl.tistory.com/92
		// scan 받은 String n 을 16진수 int로 바꿈
		int toHex = Integer.parseInt(n, 16);
		System.out.printf("%o",toHex);
	}
}
