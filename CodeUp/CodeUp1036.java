package codeup; //제출 시 패키지 삭제

import java.util.Scanner;

//제출 시 클래스 명 CodeUp1036 -> Main 으로 변경필요!
public class CodeUp1036 {

	public static void main(String[] args){
		char n;
		
		Scanner sc = new Scanner(System.in);
		
		// 참고 사이트 : https://blog.naver.com/PostView.nhn?blogId=jysaa5&logNo=221831226674
		n = sc.nextLine().charAt(0);
		sc.close();
		
		System.out.printf("%d",(int)n);
	}
}

