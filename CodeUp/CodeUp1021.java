//제출 시 패키지 삭제
package codeup;

import java.util.Scanner;
//제출 시 클래스 명 CodeUp1021 -> Main 으로 변경필요!
public class CodeUp1021 {

	public static void main(String[] args){
		char data[];
		//System.out.println("글을 입력하세요.");
		Scanner sc = new Scanner(System.in);
		
		//data는 char형식의 배열이고 sc는 String으로 담겨 Type mismatch가 난다.
		//data = sc.next();
		
		//sc를 담기위한 scanners 변수를 String 타입으로 생성
		String scanners=sc.next();
		sc.close();
		
		//scanners는 String형식의 배열이기 때문에 data에 담을 수 없다. => toCharArray() 사용함.
		data = scanners.toCharArray();
		System.out.println(data);
		
		//data[0]을 출력해 글자 하나만 나오는 것을 확인
		//System.out.println(data[0]);
		
	}
}
