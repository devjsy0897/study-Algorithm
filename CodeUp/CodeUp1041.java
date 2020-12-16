package codeup; //제출 시 패키지 삭제

import java.util.Scanner;

//제출 시 클래스 명 CodeUp1041 -> Main 으로 변경필요!
public class CodeUp1041 {

	public static void main(String[] args){
		char word;
		//Scanner 함수 사용
		Scanner sc = new Scanner(System.in);
		word = sc.nextLine().charAt(0);
		sc.close();

		// 아스키 코드 참고 사이트 https://coding-factory.tistory.com/74
		int ascii = (int)word;
		ascii += 1;
		
		char word2 = (char) ascii;
		//문자를 숫자로 바꿔 +1을 해주고 다시 문자로 바꿔서 a->b로 바꾸는것
		
		System.out.println(word2);
		
	}
}
