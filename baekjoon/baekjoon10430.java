package baekjoon; //제출시 삭제

import java.util.Scanner;

//제출시 baekjoon10430 -> Main 으로 변경
public class baekjoon10430 {
	public static void main(String[] args){
		
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		System.out.println((a+b)%c);
		System.out.println(((a%c) + (b%c))%c);
		System.out.println((a*b)%c);
		System.out.println(((a%c) * (b%c))%c);
	}

}
