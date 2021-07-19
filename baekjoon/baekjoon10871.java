package baekjoon; //제출시 삭제

import java.util.Scanner;

//제출시 baekjoon10871 -> Main 으로 변경
public class baekjoon10871 {
	public static void main(String[] args){
		
		int a,b;
		String nums = "";
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		
		int[] num = new int[a];
		for(int i=0;i<a;i++){
			num[i] = sc.nextInt();
			if(num[i]<b){
				nums += num[i]+" ";
			}
		}
		System.out.println(nums);
		
	}

}
