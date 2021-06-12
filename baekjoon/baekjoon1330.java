package baekjoon; //제출시 삭제

import java.util.Scanner;

//제출시 baekjoon10171 -> Main 으로 변경
public class baekjoon1330 {
	public static void main(String[] args){
		
		int a,b;
		Scanner sc = new Scanner(System.in);	
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>b)
		{
			System.out.println(">");
		}
		else if(a<b)
		{
			System.out.println("<");
		}
		else if(a==b)
		{
			System.out.println("==");
		}
	}

}
