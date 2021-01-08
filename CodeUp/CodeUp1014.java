//제출 시 패키지 삭제 
package codeup;

import java.util.Scanner;

//제출 시 클래스 명 CodeUp1014 -> Main 으로 변경필요! 
public class CodeUp1014 {

    public static void main(String[] args) {

    	
    	Scanner sc = new  Scanner(System.in);
    	String x = sc.next();
    	String y = sc.next();
    	sc.close();
    	char c1 = x.charAt(0);
    	char c2 = y.charAt(0);
    	System.out.println(c2+" "+c1);
    
    }
}
