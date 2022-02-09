package koreait.day3;

public class LogicalOPTest2 {	//논리연산 연습
	public static void main(String[] args) {
	
		System.out.println("논리연산 결과 확인하기 : and");
		System.out.println(" true and true = " + (true&&true));
		System.out.println(" true and false = " + (true&&false));
		System.out.println(" false and true = " + (false&&true));	 			//빨간 밑줄은 dead code. 앞이 false이므로 뒤의 값은 볼 필요도 없다.
		System.out.println(" false and false = " + (false&&false));
		
		System.out.println("논리연산 결과 확인하기 : or");
		System.out.println(" true or true = " + (true||true));	
		System.out.println(" true or false = " + (true||false));
		System.out.println(" false or true = " + (false||true));
		System.out.println(" false or false = " + (false||false));
		
		System.out.println("논리연산 결과 확인하기 : not");
		System.out.println("not true = " + !true);	
		System.out.println("not false = " + !false);
		
		//Quiz : korean 국어점수가 40~69점인 학생들은 "선생님 면담" 출력
		int korean;
		korean = 67;
		if(korean>=40 && korean<70)
			System.out.println("선생님 면담!");
		//		: korean 국어점수가 0~100점이 아닌 값은 "잘못된 값" 출력	
		korean = 105; 
		
		if(korean<0 || korean>100)	//1) 0보다 작거나 100보다 크다.
			System.out.println("잘못된 값1!");
		
		if(!(korean>=0 && korean<=100))	//2) 0~100이 아니다.
			System.out.println("잘못된 값2!");
	
	
	}

}
