package koreait.day10;

public class MyClass2 {
	//접근 권한 연습합니다.
	private	int age;		//private: 다른 클래스에서 사용 못합니다. 나(현재 클래스)만 사용한다.
	String name;			//default: 다른 패키지에서 사용 못합니다. 이웃이면 같이 쓰자.
	public int score;		//public:  어디서나 사용합니다. 다 같이 쓰자.
	
	//생성자 메소드: public, default에 따라 접근 권한은 설정할 수 있습니다.
	//	기본 접근권한(자동생성) : public (클래스의 접근 권한과 동일)

 //	MyClass2(){		// 이렇게 쓰면 다른 패키지에서 객체 생성을 못합니다.
 //}	
 
	
}
