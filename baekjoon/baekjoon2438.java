package baekjoon; //제출시 삭제

import java.util.Scanner;

//제출시 baekjoon2438 -> Main 으로 변경
public class baekjoon2438 {
	public static void main(String[] args){
		
		int a;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		
		String star = "*";
		for(int i=1;i<=a;i++){
			for(int j=1;j<=i;j++){
				System.out.print(star);
			}
			System.out.println("");
		}
	}

}
