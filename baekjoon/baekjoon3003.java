package baekjoon; //제출시 삭제

import java.util.Scanner;

//제출시 baekjoon3003 -> Main 으로 변경
public class baekjoon3003 {
	public static void main(String[] args){
		int[] numArr = {1,1,2,2,2,8};
		int[] getNum = new int[6];
		int[] result = new int[6];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<getNum.length;i++){
			getNum[i] = sc.nextInt();
			result[i] = numArr[i]-getNum[i];
		}

		sc.close();

		System.out.println(result[0]+" "+result[1]+" "+result[2]+" "+result[3]+" "+result[4]+" "+result[5]);

	}

}
