//제출 시 패키지 삭제 
package codeup;

import java.util.Scanner;

//제출 시 클래스 명 CodeUp1019 -> Main 으로 변경필요! 
public class CodeUp1019 {

    public static void main (String[] args) {
    	
    	//변수 초기화
        String day="";
        
        //console 창에 아무것도 없어서 임의로 넣음
        //System.out.println("년월일을 입력하세요.");
        
        //스캐너 함수 시작
        Scanner sc = new Scanner(System.in);
        
        //day변수에 콘솔창에 사용자가 입력한 값을 저장함
        day=sc.next();
        
        //스캐너 함수 끝 
        sc.close();
        
        //day 변수에 담긴 것을 "."으로 구분 분리해 dayArr에 배열로 담음
        String[] dayArr = day.split("\\.");
        int year = Integer.parseInt(dayArr[0]);
        int month = Integer.parseInt(dayArr[1]);
        int date = Integer.parseInt(dayArr[2]);
        
        //%d중간에 %02d 라고 02가 들어가 있는것은 자리수이다.
        //%02d => 1을 01로 바꾸어 준다.
        //%04d => 99를 0099로 바꾸어 준다.
        System.out.printf("%04d.%02d.%02d",year,month,date);
    }
	
}
