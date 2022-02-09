package koreait.day7;

import java.util.Scanner;

public class DecipherTest {
		//내용: 모모가 보낸 쯔위의 메시지 해독
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int key =7;
		String cypherString;
		String message;
		char[] temp;
		
		System.out.print("받은 암호 메시지를 입력하세요. -> ");
		cypherString = sc.nextLine();
		
		temp = cypherString.toCharArray(); 
				
		for(int i=0;i<temp.length;i++) {
			temp[i]-=key;
		}
		message = String.valueOf(temp);
		System.out.println("원본 메시지 : " + message);
		
	}

}
