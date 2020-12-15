package codeup; //제출 시 패키지 삭제

import java.util.Scanner;

//제출 시 클래스 명 CodeUp1037 -> Main 으로 변경필요!
public class CodeUp1037 {

	public static void main(String[] args){
		int num;
		//Scanner 함수 사용
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();

		char ascii = (char)num;
		System.out.println(ascii);
		
	}
}
