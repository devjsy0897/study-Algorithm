package baekjoon; //제출시 삭제

import java.util.Arrays;
import java.util.Scanner;

//제출시 baekjoon8958 -> Main 으로 변경
public class baekjoon8958 {
	public static void main(String[] args){
		
		int cnt = 0;
		String answer = "";
		String[] splitAnswer;
		int ckCorrect = 0;
		int allCorrect = 0;
		Scanner sc = new Scanner(System.in);
		cnt = sc.nextInt();
		
		for(int i=0;i<cnt;i++){
			answer = sc.next();
			splitAnswer = answer.split("");
			ckCorrect = 0;
			allCorrect = 0;
			for(int j=0;j<splitAnswer.length;j++){
				if(splitAnswer[j].equals("O")){
					ckCorrect++;
				}
				else if(splitAnswer[j].equals("X")){
					ckCorrect = 0;
				}
				allCorrect+=ckCorrect;
			}
			System.out.println(allCorrect);
		}
		
		
	}

}
