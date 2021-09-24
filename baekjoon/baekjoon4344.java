package baekjoon; //제출시 삭제

import java.text.DecimalFormat;
import java.util.Scanner;

//제출시 baekjoon4344 -> Main 으로 변경
public class baekjoon4344 {
	public static void main(String[] args){
		
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		cnt = sc.nextInt();
		
		for(int i=0;i<cnt;i++){
			int cnt2 = sc.nextInt();
			int[] cnt3 = new int[cnt2];
			int sumCnt = 0;
			for(int j=0;j<cnt3.length;j++){
				cnt3[j] = sc.nextInt();
				sumCnt += cnt3[j];
			}
			double avg = (double)sumCnt / cnt3.length;
			double cnt4 = 0;
			for(int j=0;j<cnt3.length;j++){
				if(cnt3[j]>avg){
					cnt4++;
				}
			}
			System.out.printf("%.3f", 100.0 * cnt4 / cnt3.length);
			System.out.println("%");
		}
		
		
	}

}
