package codeup; //제출 시 패키지 삭제

import java.util.Scanner;
import java.util.stream.Stream;
//제출 시 클래스 명 CodeUp1025 -> Main 으로 변경필요!
public class CodeUp1025 {

	public static void main(String[] args){
		int data[];
		//Scanner 함수 사용
		Scanner sc = new Scanner(System.in);
		int scanners=sc.nextInt();
		sc.close();
		
		//int 형으로 받은 scanners를 int배열형인 data에 담는 함수
		data = Stream.of(String.valueOf(scanners).split("")).mapToInt(Integer::parseInt).toArray();

		//제곱을 이용한 풀이, pow는 상수값(10^2, 10^3 이런것들)
		int pow = data.length;
		//for문은 이용한 출력
		for(int i=0;i<data.length;i++){
			--pow;
			int power = (int)Math.pow(10, pow);
			System.out.println("["+data[i]*power+"]");
		}
	}
}
