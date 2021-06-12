package baekjoon; //제출시 삭제

import java.util.Scanner;

//제출시 baekjoon10950 -> Main 으로 변경
public class baekjoon10950 {
	public static void main(String[] args){
		
		int a,b,c;
		Scanner sc = new Scanner(System.in);	
		a=sc.nextInt();
		
		for(int i=0;i<a;i++)
		{
			b=sc.nextInt();
			c=sc.nextInt();
			System.out.println(b+c);
		}
	}

}
