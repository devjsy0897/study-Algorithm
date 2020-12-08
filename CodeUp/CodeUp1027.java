package codeup; //제출 시 패키지 삭제

import java.util.Scanner;

//제출 시 클래스 명 CodeUp1027 -> Main 으로 변경필요!
public class CodeUp1027 {

	public static void main(String[] args){
		String ymd;
		String ymdArray[];
		//System.out.println("yyyy.mm.dd 입력해주세요");
		//Scanner 함수 사용
		Scanner sc = new Scanner(System.in);
		ymd = sc.next();
		sc.close();

		//System.out.println(ymd);
		ymdArray = ymd.split("\\.");
		//ymd-> dmy 출력
		System.out.printf("%s-%s-%s", ymdArray[2], ymdArray[1], ymdArray[0]);
	}
}
