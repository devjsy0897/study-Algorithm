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
		System.out.println("합은 "+sum);
		for(int i=0;i<10;i++){
			int cnt = 0;
			int last = 0;
			while(true){
				last = sum.indexOf(i+"",last);
				System.out.println("last : "+last+" / cnt : "+cnt);
				if(sum.indexOf(i+"",last+cnt)!=-1){
					System.out.println(i+"는 "+sum.indexOf(i+"",last));
					
					cnt++;
				}else{
					break;
				}
			}
		}
		
		
	}

}
