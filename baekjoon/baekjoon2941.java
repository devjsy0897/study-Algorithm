package baekjoon; //제출시 삭제

import java.util.Scanner;

//제출시 baekjoon2941 -> Main 으로 변경
public class baekjoon2941 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
	    String str=sc.nextLine().trim();
	    sc.close();
	    String[] arr= {"c=","c-","dz=","d-","lj","nj","s=","z="};
	    
	    for(int i=0;i<arr.length;i++) {
	        if(str.contains(arr[i])) {
	            str=str.replaceAll(arr[i]," ");
	            }
	        }   
	    System.out.println(str.length());
		
	}

}
