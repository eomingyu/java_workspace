package koreait.day15;

import java.util.Scanner;

public class ExceptionTest1 {

	public static void main(String[] args) {
		//Exception 요약: 문법 오류가 아닙니다. 실행하면서 발생하는 오류입니다.(발생 가능성을 고려해서  프로그래밍해야 합니다.)
		//	-> 원인에 따라 다른 이름xxxxException이 발생하고 이들은 Exception 클래스의 자식 클래스입니다.		
		//	-> Exception이 실행 중에 발생하면 프로그램이 그 시점부터 중단됩니다.
		// 		따라서, Exception을 예상하고 프로그램이 중단되지 않도록 프로그램을 구현해야 합니다.
		
		//Exception 예시1
		String message = null;
		char temp = message.charAt(0);	//message 문자열에서 첫 번째(0) 글자 1개 가져오기
		//실행했을 때 NullPointerException이 발생합니다. ->이유 : message 참조 객체 null이기 때문입니다.
		
		 double c = Double.parseDouble("123,456,000.123");
		//		 	 Double.parseDouble("1234.567"); -> 정상 실행
		 System.out.println("c = "+c);
		
		 //Exception 예시2
		 int[] num = new int[5];	//배열선언: 요소 5개입니다.
		 num[5]=100;
		 //실행했을 때 ArrayIndexOutOfBoundsException이 발생합니다. ->이유: 인덱스 0~4

		 //Exception 예시3
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();	//키보드 입력을 정수로 변환해서 변수에 저장합니다.
		//사용자 입력한 문자에 숫자 외의 것이 있을 때 InputMismatchException이 발생합니다.
		
		//Exception 예시4 
		//Wrapper 클래스에는 **문자열을 기본형 타입으로 변환하는 메소드가 있습니다.
		int b = Integer.parseInt("abc");
		//		Integer.parseInt("123"); -> 정상 실행
		System.out.println("b=" + b);
		//정수로 변환할 수 없는 문자열은 NumberFormatException이 발생합니다.
		
		
		
	}

}
