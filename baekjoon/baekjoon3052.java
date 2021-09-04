package baekjoon; //제출시 삭제

import java.util.Arrays;
import java.util.Scanner;

//제출시 baekjoon3052 -> Main 으로 변경
public class baekjoon3052 {
	public static void main(String[] args){
		
		String[] num = new String[10];				// 첫 숫자 10개 입력
		String[] remainder = new String[10];		// 숫자 10개 나머지 값
		String[] temporaryRemainder = new String[10];// 숫자 10개 나머지 값에서 for문 현재 위치 값 제거하고 저장
		String nNum = null;							// 숫자 10개 나머지 값에서 현재 위치 값
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<10;i++){
			num[i]=sc.nextLine();
			remainder[i] = (Integer.parseInt(num[i])%42)+"";
		}
		for(int i=0;i<10;i++){
				nNum = remainder[i];
				temporaryRemainder = remainder;
				temporaryRemainder[i] = null;
				if(Arrays.asList(temporaryRemainder).indexOf(nNum) == -1){
					cnt++;
				}
		}
		System.out.println(cnt);
		
		
		
	}

}
