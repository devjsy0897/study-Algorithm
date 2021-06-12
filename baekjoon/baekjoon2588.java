package baekjoon; //제출시 삭제

import java.util.Scanner;

//제출시 baekjoon2588 -> Main 으로 변경
public class baekjoon2588 {
	public static void main(String[] args){
		
		int a,b;
		int b1,b10,b100;
		Scanner sc = new Scanner(System.in);	
		a=sc.nextInt();
		b=sc.nextInt();
		//b의 1의자리 수
		b1 = b-((b/10)*10);
		//b의 10의자리 수
		b10 = (b-((b/100)*100)-b1)/10;
		//b의 100의 자리 수
		b100 = b/100;
		System.out.println(a*b1);
		System.out.println(a*b10);
		System.out.println(a*b100);
		System.out.println(a*b);
	}

}
