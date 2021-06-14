package baekjoon; //제출시 삭제

import java.util.Scanner;

//제출시 baekjoon8393 -> Main 으로 변경
public class baekjoon8393 {
	public static void main(String[] args){
		
		int a;
		Scanner sc = new Scanner(System.in);	
		a=sc.nextInt();
		
		int b=0;
		for(int i=1;i<=a;i++)
		{
			b+=i;
		}
		System.out.println(b);
	}

}
