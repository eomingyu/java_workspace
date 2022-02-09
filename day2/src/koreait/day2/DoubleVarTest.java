package koreait.day2;

public class DoubleVarTest {
	//실수 타입 변수 연습
	
	public static void main(String[] args) {
		
		//1. 선언
		float p1;
		double p2;
		
		//2. 데이터 저장
		p1 = 3.1415F;	//float 형식으로 데이터를 표시할 때는 F(f)를 표기합니다.
		p2 = 3.1415;
		
		//3. 변수 사용 :연산
		p2 = p2 * 1.1;
//		p1 = p1 * 1.1;	//사칙연산 결과는 double입니다. 
						//오류: double 결과를 float에 저장 못합니다.
		
		//p2값 출력
		System.out.println("p1 = " + p1);
		System.out.println("p2 = " + p2);
		
		//실제 기계어로 실수를 표현하는 방식은 복잡한 형식이 있습니다. 실제 결과와 다를 수도 있습니다.
		System.out.println(0.1 + 1.6);
		System.out.printf("%5.2f\n", (0.1 + 1.6));	//%f는 실수형식. 전체 5자리, 소수점 이하 2자리
		
		//실수의 특별한 연산 결과
		System.out.println("Infinity(무한대): 0.0으로 나눌 때입니다.");
		System.out.println(3.0/0.0);
		System.out.println("Nan(Not a Number): 제수,피제수 모두 0.0일 때입니다 ");
		System.out.println(0.0/0.0);
		
		//그렇다면 정수는??
	//	System.out.println(3/0);	//오류
	//	System.out.println(0/0);	//오류
		System.out.println(0/3);	//결과 0
		
		
	}
	
	
}
