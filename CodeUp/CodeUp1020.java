//제출 시 패키지 삭제
package codeup;

import java.util.Scanner;
//제출 시 클래스 명 CodeUp1020 -> Main 으로 변경필요!
public class CodeUp1020 {

	public static void main(String[] args){
		String idNum="";
		//System.out.println("주민등록번호를 '-'를 포함하여 입력하시오");
		
		//Scanner 함수 사용
		Scanner sc = new Scanner(System.in);
		idNum=sc.next();
		sc.close();
		//Scanner 함수 끝, idNum에 담음
		
		//idNum에 잘 들어왔는지 확인
		//System.out.println(idNum);
		String idNumArr[] = idNum.split("-");
		System.out.println(idNumArr[0]+idNumArr[1]);
	}
}
