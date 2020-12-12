package codeup; //제출 시 패키지 삭제

import java.util.Scanner;

//제출 시 클래스 명 CodeUp1033 -> Main 으로 변경필요!
public class CodeUp1033 {

	public static void main(String[] args){
		int d;
		//Scanner 함수 사용
		Scanner sc = new Scanner(System.in);
		d = sc.nextInt();
		sc.close();

		System.out.printf("%X",d);
	}
}
