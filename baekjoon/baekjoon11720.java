package baekjoon; //제출시 삭제

import java.util.Scanner;

//제출시 baekjoon11720 -> Main 으로 변경
public class baekjoon11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int maxNum = sc.nextInt();
		String num = sc.next();
		int addNum = 0;
		sc.close();
		
		for(int i=0;i<maxNum;i++){
			addNum += num.charAt(i)-'0';
		}
		System.out.println(addNum);
	}
}
