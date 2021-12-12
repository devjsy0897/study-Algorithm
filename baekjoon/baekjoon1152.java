package baekjoon; //제출시 삭제

import java.util.Scanner;

//제출시 baekjoon1152 -> Main 으로 변경
public class baekjoon1152 {
	public static void main(String[] args){
		
		String str;
		Scanner sc = new Scanner(System.in);

		str = sc.nextLine();
		sc.close();
		String str_split[] = str.split(" ");
		int cnt = 0;
		for(int i=0;i<str_split.length;i++){
			if(str_split[i].length()!=0){
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
