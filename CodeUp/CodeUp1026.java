package codeup; //제출 시 패키지 삭제

import java.util.Scanner;

//제출 시 클래스 명 CodeUp1026 -> Main 으로 변경필요!
public class CodeUp1026 {

	public static void main(String[] args){
		String time;
		String timeArr[];
		int m;
		
		//Scanner 함수 사용
		Scanner sc = new Scanner(System.in);
		time = sc.next();
		sc.close();

		timeArr=time.split(":");
		m = Integer.parseInt(timeArr[1]);
		
		System.out.println(m);
	}
}
