//제출 시 패키지 삭제
package codeup;

import java.util.Scanner;
//제출 시 클래스 명 CodeUp1022 -> Main 으로 변경필요!
public class CodeUp1022 {

	public static void main(String[] args){
		//코드는 1021을 복사해서 sc.next() -> sc.nextLine()으로만 변경함.
		char data[];
		Scanner sc = new Scanner(System.in);
		
		String scanners=sc.nextLine();
		
		sc.close();
		data = scanners.toCharArray();
		System.out.println(data);
	}
}
