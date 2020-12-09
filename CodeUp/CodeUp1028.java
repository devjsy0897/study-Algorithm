package codeup; //제출 시 패키지 삭제

import java.util.Scanner;

//제출 시 클래스 명 CodeUp1027 -> Main 으로 변경필요!
public class CodeUp1028 {

	public static void main(String[] args){
		// 검색해보니 자바에서는 unsigned를 사용하지 않는다.
		// =>정수 중 가장 길게 적을 수 있는 long을 사용함. 
		long n;
		
		//Scanner 함수 사용
		Scanner sc = new Scanner(System.in);
		n = sc.nextLong();
		sc.close();

		
		System.out.printf("%d",n);
	}
}
