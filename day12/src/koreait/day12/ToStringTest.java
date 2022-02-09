package koreait.day12;

public class ToStringTest {

	public static void main(String[] args) {

		Member member = new Member();
		member.id = 21;
		member.name = "이모모";
		//member.print();//지금까지 만들었던 메소드: 필드 출력 용도입니다.
		
		System.out.println(member.toString());
		//toString 재정의하기 전
		//결과: koreait.day12.Member@372f7a8d(패키지명.클래스명@객체구별값 16진수
		//toString 재정의한 후 결과: Member [id=21, name=이모모]
		
		System.out.println(member);
		//결과 같다. : Member [id=21, name=이모모]
	
	
	}

}
