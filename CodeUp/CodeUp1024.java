package codeup; //제출 시 패키지 삭제

import java.util.Scanner;
//제출 시 클래스 명 CodeUp1024 -> Main 으로 변경필요!
public class CodeUp1024 {

	public static void main(String[] args){
		char data[];
		//Scanner 함수 사용
		Scanner sc = new Scanner(System.in);
		String scanners=sc.next();
		sc.close();
		
		//scanners를 char형으로 바꾸어 data 배열안에 넣어준다
		data = scanners.toCharArray();
		
		//for문은 이용한 출력
		for(int i=0;i<data.length;i++)
			System.out.println("'"+data[i]+"'");
	}
}
