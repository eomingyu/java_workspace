package koreait.day3;

import java.util.Scanner;		//java.util 패키지의 Scanner 클래스를 메모리에 로드합니다.
							//java.lang 패키지의 클래스들은 기본 클래스 -import 안 합니다.
public class KeyInputTest {		//키보드 입력으로 변수에 값을 저장하는 연습입니다.

	public static void main(String[] args) {
		// 키보드 입력은 표준 입력: System 클래스 in 필드를 사용합니다.
		// -> 편하게 입력을 처리하기 위해 Scanner 클래스를 사용합니다.
		
		// 화면 출력은 표준 출력: System 클래스 out 필드를 사용합니다.
		//System.out.println();
		
		//import 필요합니다.
		Scanner sc = new Scanner(System.in); //->지금은 외우기.
							//sc는 변수입니다. 기본형 변수가 아니고 참조형(클래스타입)
		//입력을 위한 코드
		//키보드 입력 -> 변수에 저장
		int data;

		System.out.print("정수값 1개를 입력하세요. >>> ");  //입력 받기 전에 출력
		data = sc.nextInt();		//입력된 값을 정수로 변환(nextInt메소드)하고 data변수에 저장합니다.		
	
		System.out.println("지금 입력하신 값은 " + data + "입니다.!");
				
		
		//느낌으로 하는 미션.. 실수를 입력 받아서 출력(소수점 이하 4자리)합니다.
		double data2;			//입력된 값을 double로 변환(nextDouble메소드)하고 data2변수에 저장합니다.
	
		System.out.print("\n실수값 1개를 입력하세요. >>> ");
		data2 = sc.nextDouble();
	
		System.out.printf("지금 입력하신 값은 %.4f입니다.!\n", data2);
				
		sc.close(); //Scanner 타입 변수 사용 종료
		//리소스(자원) : 입출력 클래스는 메모리 등 추가적인 자원을 사용하므로 해제가 필요합니다.
		
	}
	//키보드 입력: 실행을 하면 커서가 보입니다. 커서 자리에서 입력합니다.
}