package baekjoon; //제출시 삭제

import java.util.Scanner;

//제출시 baekjoon1065 -> Main 으로 변경
public class baekjoon1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		int saveNum = num;
		int tempNum = 0;
		int[] sepNum = new int[5];
		int sub = 0;
		int ck = 0;
		if(saveNum<100){
			ck = saveNum;
		}
		
		int badNum = 0; 
			if(saveNum>99){
				for(int i=100;i<=saveNum;i++){
					tempNum = i;
					int cnt = 0;
				while(tempNum > 0) {
					badNum = 0; 
	
					sepNum[cnt] = tempNum%10;
	
					tempNum /= 10;
					
					
					if(cnt==1){
						sub = sepNum[cnt]-sepNum[cnt-1];
					}
					if(cnt>1){
						if(sepNum[cnt]-sepNum[cnt-1] != sub){
							badNum = 1;
							break;	
						}
					}
					
					cnt++;
	
					
						
				}
				if(badNum == 0)ck++;
			}
		}
		if(saveNum<100){
			System.out.println(ck);
		}
		if(saveNum>99){
			System.out.println(ck+99);
		}
		
	}
}
