package baekjoon; //제출시 삭제

import java.util.Scanner;

//제출시 baekjoon10872 -> Main 으로 변경
public class baekjoon10872 {
	public static void main(String[] args){
		
		int num=1;
		int factorial = 1;
		Scanner sc = new Scanner(System.in);	
		num=sc.nextInt();
		sc.close();
		
		if(num == 0){
			System.out.println(1);
		}
		else{
			for(int i=1;i<=num;i++){
				//System.out.println(factorial +" x "+i);
				factorial *=i;
			}
			System.out.println(factorial);
		}
		
	}

}
