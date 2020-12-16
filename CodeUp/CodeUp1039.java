package codeup; //제출 시 패키지 삭제

import java.util.Scanner;

//제출 시 클래스 명 CodeUp1039 -> Main 으로 변경필요!
public class CodeUp1039 {

	public static void main(String[] args){
		long num1,num2;
		
		//Scanner 함수 사용
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextLong();
		num2 = sc.nextLong();
		sc.close();

		System.out.println(num1+num2);
		
	}
}
