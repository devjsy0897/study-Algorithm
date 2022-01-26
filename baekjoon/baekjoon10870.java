package baekjoon; //제출시 삭제

import java.util.Scanner;

//제출시 baekjoon10870 -> Main 으로 변경
public class baekjoon10870 {
	public static void main(String[] args){
		
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		int cnt;
		Scanner sc = new Scanner(System.in);	
		cnt = sc.nextInt();
		sc.close();
		
		for(int i=2;i<=cnt;i++){
			//System.out.println(num1+"  "+num2+"  "+(num1+num2));
			num3 = num1+num2;
			num1 = num2;
			num2 = num3;
			
		}
		if(cnt == 0 || cnt == 1){
			num3 = 0;
		}
		if(cnt == 1){
			num3 = 1;
		}
		System.out.println(num3);
		
		
	}

}
