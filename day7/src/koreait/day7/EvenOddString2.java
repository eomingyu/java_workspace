package koreait.day7;

import java.util.Scanner;

public class EvenOddString2 {
	//입력문자열은 문자열 상태로 결과문자열은  char[] 이용하여 처리합니다.
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String src_string;
		String even_string="";
		String odd_string="";
		char[] even = new char[30];   //미리 저장 공간 지정
		char[] odd = new char[30];   
		System.out.print("문자열(공백과 기호,숫자 포함)을 입력하세요. ->");
		src_string = sc.nextLine();
		
		for(int i=0;i<src_string.length();i++) {               
			if(i%2==0) even[i/2]=src_string.charAt(i);
			else odd[i/2]=src_string.charAt(i);
		}
		even_string = String.valueOf(even);
		odd_string = String.valueOf(odd);
		
		System.out.println("\n[[결과]] ");
		System.out.println("짝수 문자열 ... " + even_string);
		System.out.println("홀수 문자열 ..." + odd_string);
		
	}

}
