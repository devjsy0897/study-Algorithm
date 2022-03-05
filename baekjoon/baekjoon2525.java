package baekjoon; //제출시 삭제

import java.util.Scanner;

//제출시 baekjoon2525 -> Main 으로 변경
public class baekjoon2525 {
	public static void main(String[] args){
		
		
		Scanner sc = new Scanner(System.in);	
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int plus = sc.nextInt();
		
		sc.close();

		min = min+plus;
		if(min>=60){
			while(min>=60){
				if(hour<=22){
					hour+=1;
					min-=60;
				}
				else if(hour==23){
					hour=0;
					min-=60;
				}
			}
		}
		System.out.println(hour+" "+min);
		
		
	}

}
