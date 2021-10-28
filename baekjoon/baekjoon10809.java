package baekjoon; //제출시 삭제

import java.util.Scanner;

//제출시 baekjoon10809 -> Main 으로 변경
public class baekjoon10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		sc.close();
		
		String[] alphabet = new String[26];
		
		alphabet[0] = str.indexOf("a")+"";
		alphabet[1] = str.indexOf("b")+"";
		alphabet[2] = str.indexOf("c")+"";
		alphabet[3] = str.indexOf("d")+"";
		alphabet[4] = str.indexOf("e")+"";
		alphabet[5] = str.indexOf("f")+"";
		alphabet[6] = str.indexOf("g")+"";
		alphabet[7] = str.indexOf("h")+"";
		alphabet[8] = str.indexOf("i")+"";
		alphabet[9] = str.indexOf("j")+"";
		alphabet[10] = str.indexOf("k")+"";
		alphabet[11] = str.indexOf("l")+"";
		alphabet[12] = str.indexOf("m")+"";
		alphabet[13] = str.indexOf("n")+"";
		alphabet[14] = str.indexOf("o")+"";
		alphabet[15] = str.indexOf("p")+"";
		alphabet[16] = str.indexOf("q")+"";
		alphabet[17] = str.indexOf("r")+"";
		alphabet[18] = str.indexOf("s")+"";
		alphabet[19] = str.indexOf("t")+"";
		alphabet[20] = str.indexOf("u")+"";
		alphabet[21] = str.indexOf("v")+"";
		alphabet[22] = str.indexOf("w")+"";
		alphabet[23] = str.indexOf("x")+"";
		alphabet[24] = str.indexOf("y")+"";
		alphabet[25] = str.indexOf("z")+"";
		for(int i=0;i<alphabet.length;i++){
			System.out.print(alphabet[i]+" ");
		}
	}
}
