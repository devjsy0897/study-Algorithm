package baekjoon; //제출시 삭제

import java.util.Scanner;

//제출시 baekjoon2562 -> Main 으로 변경
public class baekjoon2562 {
	public static void main(String[] args){
		
		int[] a = new int[9];
		int maxNum = 0;
		int cnt = 0;

		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<9;i++){
			a[i]=sc.nextInt();
			if(a[i] > maxNum){
				maxNum = a[i];
				cnt = i;
			}
		}
		
		System.out.println(maxNum);
		System.out.println(cnt);
		
	}

}
