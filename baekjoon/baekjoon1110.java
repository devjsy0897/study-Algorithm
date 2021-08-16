package baekjoon; //제출시 삭제

import java.util.Scanner;

//제출시 baekjoon1110 -> Main 으로 변경
public class baekjoon1110 {
	public static void main(String[] args){
		
		int originalNum,firstNum,secondNum,combineNum;
	
		Scanner sc = new Scanner(System.in);
		originalNum=sc.nextInt();
		
		combineNum = originalNum;
		int cnt = 0;
		while(true){
			if(0<=combineNum&&combineNum<=99){
				cnt++;
				
				firstNum=combineNum/10;
				secondNum=combineNum%10;
				combineNum =  Integer.parseInt(secondNum+""+((firstNum+secondNum)%10));
				
				if(combineNum==originalNum){
					System.out.println(cnt);
					break;
				}
			}
		}
	}

}
