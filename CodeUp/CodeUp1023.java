//제출 시 패키지 삭제
package codeup;

import java.util.Scanner;
//제출 시 클래스 명 CodeUp1023 -> Main 으로 변경필요!
public class CodeUp1023 {

	public static void main(String[] args){
		double num;
		
		//System.out.println("실수를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		num = (Double)sc.nextDouble();
		sc.close();
		//System.out.println("입력받은 숫자 : "+num);

		//Double형인 num을 String형인 sNum으로 변환
		String sNum = Double.toString(num);
		//String형으로 변환된 sNum을 split 함수로 자르기!
		String numArr[] = sNum.split("\\.");
		
		//System.out.println(numArr[0]+numArr[1]);
		System.out.println(numArr[0]);
		System.out.println(numArr[1]);
		
	}
}
