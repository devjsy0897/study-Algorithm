//제출 시 패키지 삭제 
package codeup;

import java.util.Scanner;

//제출 시 클래스 명 CodeUp1011 -> Main 으로 변경필요! 
public class CodeUp1011 {

    public static void main(String[] args) {

    	
    	Scanner sc = new  Scanner(System.in);
    	//자바 Scanner는 문자를 입력받는 기능이 없다.
    	//즉, Scanner.next()로 문자열을 입력받은 다음, 
    	//String.charAt(0)으로 첫번째 문자를 꺼내오면 된다.
    	String x = sc.next();
    	sc.close();
    	char c = x.charAt(0);
    	System.out.println(c);
    
    }
}
