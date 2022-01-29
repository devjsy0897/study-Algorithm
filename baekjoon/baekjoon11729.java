package baekjoon; //제출시 삭제

import java.util.Arrays;
import java.util.Scanner;

//제출시 baekjoon11729 -> Main 으로 변경
public class baekjoon11729 {
	public static void main(String[] args){
		
		int num = 0;

		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		
		int[] hanoi1 = new int[num];
		int[] hanoi2 = new int[num];
		int[] hanoi3 = new int[num];
		System.out.println("hanoi.length:"+hanoi1.length);
		for(int i=1;i<=hanoi1.length;i++){
			hanoi1[i-1] = i; 
		}
		
		System.out.println(Arrays.toString(hanoi1));
		System.out.println(Arrays.toString(hanoi2));
		System.out.println(Arrays.toString(hanoi3));
		System.out.println("-------------------------");
		//만약 홀이면 시작을 3번으로
		if(hanoi1[hanoi1.length-1]%2==1){
			hanoi3[hanoi3.length-1] = hanoi1[0];
			hanoi1[0]=0;
		}
		else if(hanoi1[hanoi1.length-1]%2==0){
			hanoi3[hanoi2.length-1] = hanoi1[0];
			hanoi1[0]=0;
		}
		
		System.out.println(Arrays.toString(hanoi1));
		System.out.println(Arrays.toString(hanoi2));
		System.out.println(Arrays.toString(hanoi3));
	}

}
