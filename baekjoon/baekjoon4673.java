package baekjoon; //제출시 삭제

//제출시 baekjoon4673 -> Main 으로 변경
public class baekjoon4673 {
	public static void main(String[] args){
		
		int numList[] = new int[100001];
		int num=0;
		for(int i=1;i<=100000;i++){
			//숫자 1개 (ex 1,2,3..)
			if(i<10){
				num = i+i;
			}
			//숫자 2개 (ex 12,14,58...)
			else if(i<100){
				int num1 = i/10;
				int num2 = (i-num1*10);
				num = i+num1+num2;
			}
			// 숫자 3개 (ex 121,264,568...)
			else if(i<1000){
				int num1 = i/100;
				int num2 = (i-num1*100)/10;
				int num3 = i-num1*100-num2*10;
				num = i+num1+num2+num3;
			}
			// 숫자 4개 (ex 1324,3495,8577...)
			else if(i<10000){
				int num1 = i/1000;
				int num2 = (i-num1*1000)/100;
				int num3 = (i-num1*1000-num2*100)/10;
				int num4 = i-num1*1000-num2*100-num3*10;
				num = i+num1+num2+num3+num4;
			}
			// 숫자 5개 (ex 27382,54897,94739...)
			else if(i<10000){
				int num1 = i/10000;
				int num2 = (i-num1*10000)/1000;
				int num3 = (i-num1*10000-num2*1000)/100;
				int num4 = (i-num1*10000-num2*1000-num3*100)/10;
				int num5 = i-num1*10000-num2*1000-num3*100-num4*10;
				num = i+num1+num2+num3+num4+num5;
			}
				
			numList[num] = num;
		}
		for(int i=1;i<=10000;i++){
			if(numList[i]==0)
			System.out.println(i);
		}
		
		
	}

}
