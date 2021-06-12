package baekjoon; //제출시 삭제

import java.util.Scanner;

//제출시 baekjoon14681 -> Main 으로 변경
public class baekjoon14681 {
	public static void main(String[] args){
		
		int a,b;
		Scanner sc = new Scanner(System.in);	
		a=sc.nextInt();
		b=sc.nextInt();
		if(a>0&&b>0)
		{
			System.out.println(1);
		}
		else if(a<0&&b>0)
		{
			System.out.println(2);
		}
		else if(a<0&&b<0)
		{
			System.out.println(3);
		}
		else if(a>0&&b<0)
		{
			System.out.println(4);
		}
	}

}
