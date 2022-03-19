package baekjoon; //제출시 삭제

import java.util.Scanner;

//제출시 baekjoon2480 -> Main 으로 변경
public class baekjoon2480 {
	public static void main(String[] args){
		
		int num1,num2,num3;
		int result = 0;
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		sc.close();
		
		// num 3개가 다 같은 경우
		if(num1 == num2 && num2 == num3 && num1 == num3){
			result = 10000+(num1)*1000;
		}
		
		// num 2개가 같은 경우
		if(result == 0){
			if(num1 == num2){
				result = num1;
				result = 1000+(num1)*100;
			}else if(num2 == num3){
				result = num2;
				result = 1000+(num2)*100;
			}else if(num1 == num3){
				result = num1;
				result = 1000+(num1)*100;
			}
		}

		// num이 다 다른 경우
		if(result == 0){
			result = (num1 > num2)? num1 : num2;
			result = (result > num3)? result : num3;
			result = result * 100;
		}
		
		System.out.println(result);
		
	}

}
