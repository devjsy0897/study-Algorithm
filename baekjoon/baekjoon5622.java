package baekjoon; //제출시 삭제

import java.util.Arrays;
import java.util.Scanner;

//제출시 baekjoon5622 -> Main 으로 변경
public class baekjoon5622 {
	public static void main(String[] args){
		
		String getStr = "";
		Scanner sc = new Scanner(System.in);
		getStr = sc.nextLine();
		sc.close();
		//System.out.println(getStr);
		
		String str[] = new String[8];
		str[0] = "ABC";
		str[1] = "DEF";
		str[2] = "GHI";
		str[3] = "JKL";
		str[4] = "MNO";
		str[5] = "PQRS";
		str[6] = "TUV";
		str[7] = "WXYZ";
		
		String spStr[] = getStr.split("");
		int time = 0;
		for(int i=0;i<spStr.length;i++){
			//System.out.println(spStr[i]);
			time+=2;
			for(int j=0;j<str.length;j++){
				//System.out.println("str[j] : "+str[j]+" spStr[i] : "+spStr[i]+" indexof : "+str[j].indexOf(spStr[i]));
				if(str[j].indexOf(spStr[i])!=-1){
					switch (j) {
					case 0:
						time+=1;
						break;
					case 1:
						time+=2;
						break;
					case 2:
						time+=3;
						break;
					case 3:
						time+=4;
						break;
					case 4:
						time+=5;
						break;
					case 5:
						time+=6;
						break;
					case 6:
						time+=7;
						break;
					case 7:
						time+=8;
						break;
					}
					//System.out.println(time);
				}
			}
		}
		System.out.println(time);
	}

}
