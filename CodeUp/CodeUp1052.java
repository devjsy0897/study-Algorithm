package codeUp; //제출 시 패키지 삭제

import java.util.Scanner;

//제출 시 클래스 명 CodeUp1052 -> Main 으로 변경필요!
public class CodeUp1052 {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		
		if(a==1){
			System.out.println(0);
		}else if(a==0){
			System.out.println(1);
		}
	}
}

