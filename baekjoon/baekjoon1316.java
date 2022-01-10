package baekjoon; //제출시 삭제

import java.util.Scanner;

//제출시 baekjoon1316 -> Main 으로 변경
public class baekjoon1316 {
	public static void main(String[] args){
		
		int num;
		Scanner sc = new Scanner(System.in);	
		num = sc.nextInt();
		String[] array = new String[num];
		
		for(int i=0;i<num;i++){
			array[i]=sc.nextLine();
		}
		sc.close();
		String[] strArray;
		for(int i=0;i<array.length;i++){
		strArray = array[i].split("");
		}
		for(String sp : strArray){
			System.out.println(sp);
		}
	}

}
