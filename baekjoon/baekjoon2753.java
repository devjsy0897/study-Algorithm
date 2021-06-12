package baekjoon; //제출시 삭제

import java.util.Scanner;

//제출시 baekjoon2753 -> Main 으로 변경
public class baekjoon2753 {
	public static void main(String[] args){
		
		int a;
		Scanner sc = new Scanner(System.in);	
		a=sc.nextInt();
		if(a%4==0&&(a%100!=0||a%400==0))
		{
			System.out.println(1);
		}
		else
		{
			System.out.println(0);
		}
	}

}
