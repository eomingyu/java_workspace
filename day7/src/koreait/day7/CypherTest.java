package koreait.day7;

import java.util.Scanner;

public class CypherTest {
	//연습 예제
	//내용: 모모가 쯔위에게 메시지를 전달하는데 비밀 메시지로 암호화를 합니다.
	//		모모와 쯔위는 암호를 푸는(해독) key 값으로 7이라는 숫자를 정했습니다.
	//고대 암호: 문자하나+key = ? 새로운문자 -> 이 방법으로 메시지를 암호화 해봅니다.
	
	public static void main(String[] args) {
		//원본메시지: 키보드 입력
		//암호메시지: cyperString을 출력합니다.
		Scanner sc = new Scanner(System.in);
		int key = 7;
		String message;
		String cypherString;
		char[] temp;		//초기값 선언과 배열 크기 선언 없이 할 수 있습니다.
		
		System.out.print("보내고 싶은 원본 메시지 입력하세요. -> ");
		message = sc.nextLine();
		
		//message를 temp로 변환하여 참조합니다.
		temp = message.toCharArray(); // toCharArray() : String을 char배열로 변환
		
		//문자하나+key 결과값은 temp 배열로 저장합니다.
		for(int i=0;i<temp.length;i++) {
			temp[i]+=key;		//처음에 String message = "";
								//cyperString.charAt(i) + key;
								// message += (cyperString.charAt(i) + key);
								
			
		}
		
		System.out.println(temp);
	
		//추가 기능: temp 문자배열을 문자열로 변환 참조
		cypherString = String.valueOf(temp);	//String.valueOf() 메소드는 여러 타입 데이터를 문자열로 변경.
		System.out.println("암호 메시지 : " + cypherString); //i like java -> p'sprl'qh}h
	
	
		// 이 예제의 결론: 	String을 char[]배열로 변환		-	문자열.toCharArray()
		//				char[] 배열을 String으로 변환		-	String.valueOf(문자배열)
	}

}