package codeUp; //제출 시 패키지 삭제

import java.util.Scanner;

//제출 시 클래스 명 CodeUp1056 -> Main 으로 변경필요!
public class CodeUp1056 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		if(a==b){
			System.out.println("0");
		}else {
			System.out.println("1");
		}
	}
}

