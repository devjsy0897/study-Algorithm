package baekjoon; //제출시 삭제

import java.util.Scanner;

//제출시 baekjoon2439 -> Main 으로 변경
public class baekjoon2439 {
	public static void main(String[] args){
		
		int a;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		
		String star = "*";
		for(int i=1;i<=a;i++){
			for(int j=a-i;j>=1;j--){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print(star);
			}
			System.out.println("");
		}
	}

}
