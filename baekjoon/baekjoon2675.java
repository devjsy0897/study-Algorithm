package baekjoon; //제출시 삭제

import java.util.Scanner;

//제출시 baekjoon2675 -> Main 으로 변경
public class baekjoon2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int repeat_all = sc.nextInt(); // 전체를 반복 할 수
		
		for(int i=0;i<repeat_all;i++){
			int repeat_row = sc.nextInt(); // 한 줄 반볼 할 수
			String repeat_word = sc.next(); // 주어지는 글
			String[] split_repeat_word=repeat_word.split(""); // 주어진 글을 한 글자씩 분리
			int cnt = 0;
			for(int j=1;j<=repeat_row*split_repeat_word.length;j++){
				System.out.print(split_repeat_word[cnt]);
				if(j%repeat_row==0){
					cnt++;
				}
			}
			System.out.println();
			
		}
		
		sc.close();
		
		
		
	}
}
