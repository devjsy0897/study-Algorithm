package baekjoon; //제출시 삭제

import java.util.Scanner;

//제출시 baekjoon10952 -> Main 으로 변경
public class baekjoon10952 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);	
		
		while (true) {
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			
			if(num1==0&&num2==0){
				break;
			}
			System.out.println(num1+num2);
			
		}
	}

}
