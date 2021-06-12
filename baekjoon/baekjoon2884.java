package baekjoon; //제출시 삭제

import java.util.Scanner;

//제출시 baekjoon14681 -> Main 으로 변경
public class baekjoon2884 {
	public static void main(String[] args){
		
		int a,b;
		Scanner sc = new Scanner(System.in);	
		a=sc.nextInt();
		b=sc.nextInt();
		if(b<45){
			if(a==0){
				System.out.println(23+" "+(b+15));
			}
			else
			{
			System.out.println(a-1+" "+(b+15));
			}
		}
		else if(b>=45)
		{
			System.out.println(a+" "+(b-45));
		}
	}

}
