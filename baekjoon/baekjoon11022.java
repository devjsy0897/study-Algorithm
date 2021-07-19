package baekjoon; //제출시 삭제

import java.util.Scanner;

//제출시 baekjoon11022 -> Main 으로 변경
public class baekjoon11022 {
	public static void main(String[] args){
		
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		
		for(int i=1;i<=a;i++){
			b=sc.nextInt();
			c=sc.nextInt();
			System.out.println("Case #"+i+": "+b+" + "+c+" = "+(b+c));
		}
	}

}
