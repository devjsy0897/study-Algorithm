package codeup; //제출 시 패키지 삭제

import java.util.Scanner;

//제출 시 클래스 명 CodeUp1029 -> Main 으로 변경필요!
public class CodeUp1029 {

	public static void main(String[] args){
		double d;
		//Scanner 함수 사용
		Scanner sc = new Scanner(System.in);
		d = sc.nextDouble();
		sc.close();

		//자바에서는 f를 사용하여 소수점 있는 숫자를 표현한다.
		System.out.printf("%.11f",d);
	}
}
