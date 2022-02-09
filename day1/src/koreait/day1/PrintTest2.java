package koreait.day1; //koreait.day1은 패키지 이름

public class PrintTest2 { 
	//PrintTest는 클래스 이름.시작은 반드시 대문자로.

	public static void main(String[] args) {
		//day2  출력 메소드 종류
		System.out.print("Hi! Java~~ 안녕 자바야!"); //줄바꿈 없음.
		System.out.print("---------\t-----------\n"); // \t는 탭 문자 \n은 줄바꿈 문자
		System.out.printf("%10s\n","End!"); //prinf: format 적용 (%기호 사용,s는 문자열)
		System.out.printf("%-10s\n","End!"); //prinf: format(서식) 적용 
		//%10는 10칸 내 오른쪽 정렬 %-10는 10칸 내 왼쪽 정렬
		System.out.printf("%-10s %5s\n","End!","**"); //prinf: format 적용
		
		//데이터 형식: 문자열(문장), " "기호 안에 작성. string
	}

}
// 1. 클래스: 대문자로 시작한다. 특정 기능을 갖고 있다. -> 메소드로 제공한다. 예를 들면 System, String
// 2. 메소드: 소문자로 시작한다. 예를 들면 println
//    		()기호가 바로 뒤에 나온다. ()안에는 실행에 필요한 추가적인 데이터가 작성되기도 한다.
//  형식은 클래스.메소드()와 같습니다. 
// 3. System.out.println은 특별한 경우. println 메소드는 out(출력과 관련)에 속해 있습니다.
	