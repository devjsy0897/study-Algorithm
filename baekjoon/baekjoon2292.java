package baekjoon; //제출시 삭제

import java.util.Scanner;

//제출시 baekjoon2292 -> Main 으로 변경
public class baekjoon2292 {
	public static void main(String[] args){
		
		int num;
		int level = 1;
		int past_level = 0;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		sc.close();

		while(true){
			level += cnt*6;
			//System.out.println(level);
			if(level>=num && past_level<num){
				cnt++;
				break;
			}
			cnt++;
		
		}
		System.out.println(cnt);
	}
}
