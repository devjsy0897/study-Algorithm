package baekjoon; //제출시 삭제

import java.util.Scanner;

//제출시 baekjoon10171 -> Main 으로 변경
public class baekjoon9498 {
	public static void main(String[] args){
		
		int a;
		Scanner sc = new Scanner(System.in);	
		a=sc.nextInt();
		
		if(100>=a && a>=90)
		{
			System.out.println("A");
		}
		else if(89>=a && a>=80)
		{
			System.out.println("B");
		}
		else if(79>=a && a>=70)
		{
			System.out.println("C");
		}
		else if(69>=a && a>=60)
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("F");
		}
	}

}
