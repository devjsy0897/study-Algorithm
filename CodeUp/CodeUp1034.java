package codeup; //제출 시 패키지 삭제

import java.util.Scanner;

//제출 시 클래스 명 CodeUp1034 -> Main 으로 변경필요!
public class CodeUp1034 {

	public static void main(String[] args){
		String o;
		//Scanner 함수 사용
		Scanner sc = new Scanner(System.in);
		o = sc.next();
		sc.close();

		// 도움 받은 사이즈 -> https://dpdpwl.tistory.com/92
		int binaryToOctal = Integer.parseInt(o, 8);
		System.out.println(binaryToOctal);
	}
}
