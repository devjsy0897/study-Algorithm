package codeup; //제출 시 패키지 삭제

import java.util.Scanner;

//제출 시 클래스 명 CodeUp1047 -> Main 으로 변경필요!
public class CodeUp1047 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		System.out.printf("%d", a<<1); // -> *2와 동일한 기능
	}
}

