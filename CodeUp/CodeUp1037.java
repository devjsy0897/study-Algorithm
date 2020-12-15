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

		// 아스키 코드 참고 사이트 https://coding-factory.tistory.com/74
		char ascii = (char)num;
		System.out.println(ascii);
		
	}
}
