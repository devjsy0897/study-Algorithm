package baekjoon; //제출시 삭제

import java.util.Scanner;

//제출시 baekjoon1712 -> Main 으로 변경
public class baekjoon1712 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();	
		int b = sc.nextInt();	
		int c = sc.nextInt(); 	
        sc.close();
        
		if (c <= b) {
			System.out.println("-1");
		} 
		else {
			System.out.println((a/(c-b))+1);
		}
		
		
		
		
	}

}
