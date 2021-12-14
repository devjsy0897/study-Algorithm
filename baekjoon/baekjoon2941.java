package baekjoon; //제출시 삭제

import java.util.Scanner;

//제출시 baekjoon2941 -> Main 으로 변경
public class baekjoon2941 {
	public static void main(String[] args){
		
		String str;
		Scanner sc = new Scanner(System.in);

		str = sc.nextLine();
		sc.close();

		System.out.println(str);
System.out.println("?? : "+str.indexOf("s="));

			int cnt = 0;
			int l = 0;
			while(true){
				if(str.indexOf("c=", l )!=-1){
					l = str.indexOf("c=", l );
				}else if(str.indexOf("c-", l )!=-1){
					l = str.indexOf("c-", l );
				}else if(str.indexOf("dz=", l )!=-1){
					l = str.indexOf("dz=", l );
				}else if(str.indexOf("d-", l )!=-1){
					l = str.indexOf("d-", l );
				}else if(str.indexOf("lj", l )!=-1){
					l = str.indexOf("lj", l );
				}else if(str.indexOf("nj", l )!=-1){
					l = str.indexOf("nj", l );
				}else if(str.indexOf("s=", l )!=-1){
					l = str.indexOf("s=", l );
				}else if(str.indexOf("z=", l )!=-1){
					l = str.indexOf("z=", l );
				}else{
					l = -1;
				}
					
				System.out.println(l);
				if(l == -1){
					System.out.println("탈출");
					break;
				}
				l++;
			}
			System.out.println("cnt : "+cnt);
		
	}

}
