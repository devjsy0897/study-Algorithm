package codeup; //제출 시 패키지 삭제

import java.util.Scanner;

//제출 시 클래스 명 CodeUp1046 -> Main 으로 변경필요!
public class CodeUp1046 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		
		System.out.println(a+b+c);
		System.out.printf("%.1f",(float)((a+b+c)/3.0));
	}
}

