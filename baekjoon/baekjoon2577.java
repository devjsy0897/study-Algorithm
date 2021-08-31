package baekjoon; //제출시 삭제

import java.util.Scanner;

//제출시 baekjoon2577 -> Main 으로 변경
public class baekjoon2577 {
	public static void main(String[] args){
		
		int[] num = new int[3];
		String sum = "";
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<3;i++){
			num[i]=sc.nextInt();
			
		}
		
		sum = (num[0] * num[1] * num[2]) +"";
		
		for(int i=0;i<10;i++){
			int cnt = 0;
			int last = -1;
			while(true){
				last = sum.indexOf(i+"",last+1);
				if(last==-1){
					break;
				}
				cnt++;
			}
			System.out.println(cnt);
		}
		
		
	}

}
