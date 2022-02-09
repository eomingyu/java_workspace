package koreait.day6;

public class VariableTest2 {
	//변수가 선언되는 위치로 특성을 이해하는 연습입니다.
	//static, final(최종적인) 키워드 이해하기
	
	static int gval = 34;		//클래스 소속으로 선언된 변수(필드), 위치로 보면 전역(global)변수
	int dval = 123;
	
	final int fval = 23;
	static final int fval2 = 456;
//	final int test;		//오류. final 변수는 꼭 초기값을 저장합니다.
	int test2;
	
	public static void main(String[] args) {
		
		int sum = 100;
		
		while(true) {
			int k=12;
			System.out.println("k = " + k);
			if(k==12) break;
			System.out.println("sum = " + sum);  
		}
		
		System.out.println("전역변수 gval = " + gval);	

		System.out.println("final 변수 fval2 = " + fval2);
//		fval2 = 123;	오류.	//***final 변수는 값을 변경할 수 없습니다. 
		
		//static final 예시
		System.out.println("Byte 정수의 크기: "+Byte.BYTES); //메모리의 할당 크기
		System.out.println("Byte 정수의 최소값: "+Byte.MIN_VALUE);
		System.out.println("Byte 정수의 최대값: "+Byte.MAX_VALUE);
		
		//굵은 기울어진 글씨체 -> static final
		//상수: 의미있는 값(변하지 않는 값)들을 이름으로 표기.
		//일반적으로 클래스의 기본형 상수 필드를 대문자로 표기합니다.
		
		
		
	}
	void nonStatic(int a) {
		System.out.println("nonstatic --------");
		System.out.println("전역변수 dval = " + dval);
		System.out.println("전역변수 gval = " + gval);
		System.out.println(fval);
		System.out.println("--------------");
//		fval = 100; 	//final 변수 fval 값을 변경할 수 없습니다. 오류
	}
	//*** static에서는 static만 
	//nonstatic에서는 static, nonstatic 둘 다 사용		*nonstatic은 static 키워드가 없는 것
	
	
		//3. 메소드 인자로 선언된 변수 : 지역변수 -> 해당 메소드 { } 안에서 사용
	static void methodA(int a) {
		int b = 3;		//methodA()의 지역변수
		System.out.println("b = " + b);
	}
	
}
