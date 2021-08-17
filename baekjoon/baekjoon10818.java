package baekjoon; //제출시 삭제

import java.util.Scanner;

//제출시 baekjoon10818 -> Main 으로 변경
public class baekjoon10818 {
	public static void main(String[] args){
		
		int a;
		int maxNum = -1000000;
		int minNum = 1000000;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		int[] b = new int[a];
		
		for(int i=0;i<a;i++){
			b[i]=sc.nextInt();
			if(b[i]>maxNum){
				maxNum = b[i];
			}
			if(b[i]<minNum){
				minNum = b[i];
			}
		}
		System.out.println(minNum+" "+maxNum);
		
	}

}
