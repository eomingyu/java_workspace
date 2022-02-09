package day8_;

import java.util.Scanner;

public class Ex3 {	//문자열 2개를 입력받아서 1개로 만듭니다.-> EvenOddString 예제의 반대로 처리합니다.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String msg1;
		String msg2;
		String msg="";
		char[] msgarray = new char[30];
		
		
		System.out.print("첫 번째 문자열을 입력하세요 -> ");
		msg1=sc.nextLine();
		System.out.print("두 번째 문자열을 입력하세요 -> ");
		msg2=sc.nextLine();
		
		int leng1=msg1.length();
		int leng2=msg2.length();
		
		if(leng1>=leng2) {
			for(int i=0;i<leng2*2;i+=2) {
				msgarray[i]=msg1.charAt(i/2);
				msgarray[i+1]=msg2.charAt(i/2);
			} 
			for(int j=leng2*2; j<leng1+leng2;j++)
				msgarray[j]=msg1.charAt(j-leng2);
			}
		else{
			for(int i=0;i<leng1*2;i+=2) {
				msgarray[i]=msg1.charAt(i/2);
				msgarray[i+1]=msg2.charAt(i/2);
			} 
			for(int j=leng1*2; j<leng1+leng2;j++)
				msgarray[j]=msg2.charAt(j-leng1);
			}
		
		msg=String.valueOf(msgarray);
		
		System.out.println("합친 문자열: "+msg);
		
		sc.close();
	}

}
