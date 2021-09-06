package baekjoon; //제출시 삭제

import java.util.Arrays;
import java.util.Scanner;

//제출시 baekjoon1546 -> Main 으로 변경
public class baekjoon1546 {
	public static void main(String[] args){
		
		double count = 0;	// 몇 개 과목인지
		double max = 0;		//최댓값
		double sum = 0;		//합계
		
		Scanner sc = new Scanner(System.in);
		count = sc.nextDouble();	//과목개수 입력받음
		
		double subject[] = new double[(int) count]; //과목 배열로 생성 
		
		for(int i=0;i<count;i++){
			subject[i] = sc.nextDouble();	//과목 하나씩 배열로 입력받음
			if(max<subject[i]){
				max = subject[i];
			}
		}
		for(int i=0;i<count;i++){
			subject[i] = subject[i]/max*100;
			sum +=subject[i];
		}
		double result = sum/count;
		System.out.println(result);
		
	}

}
