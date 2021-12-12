package baekjoon; //제출시 삭제

import java.util.Scanner;

//제출시 baekjoon1152 -> Main 으로 변경
public class baekjoon2908 {
	public static void main(String[] args){
		
		String str1,str2;
		Scanner sc = new Scanner(System.in);

		str1 = sc.next();
		str2 = sc.next();
		sc.close();
		
		String str1_split[] = str1.split("");
		String str2_split[] = str2.split("");
		String str1_reverse="";
		String str2_reverse="";
		for(int i=str1_split.length-1;i>=0;i--){
			str1_reverse+=str1_split[i];
		}
		for(int i=str2_split.length-1;i>=0;i--){
			str2_reverse+=str2_split[i];
		}
		int num1 = Integer.parseInt(str1_reverse);
		int num2 = Integer.parseInt(str2_reverse);
		if(num1>num2){
			System.out.println(num1);
		}else if(num1<num2){
			System.out.println(num2);
		}
	}

}
