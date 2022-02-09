package koreait.day4;

import java.util.Scanner;

public class UpperLowerString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String message;
		String upper;
		String lower;		
		char[] uppers = new char[20];    
		char[] lowers = new char[20];
		int k = 0;
		int j = 0;
		
		System.out.print("문자열(영문만)을 입력하세요 .-> ");
		message = sc.nextLine();
		
		for(int i=0;i<message.length();i++) {
			char temp = message.charAt(i); 
			if(temp >='A' && temp <='Z') {
				uppers[k] = message.charAt(i);
				k++;
			}
			else if(temp >= 'a' && temp <= 'z') {
				lowers[j] = message.charAt(i);
				j++;
			}
		}
		upper = String.valueOf(uppers);
		lower = String.valueOf(lowers);
		
		System.out.println();
		System.out.println("[[결과]]");
		System.out.println("대문자 문자열....." + upper);
		System.out.println("소문자 문자열....." + lower);
		
	}

}
