package koreait.day11;

public class Cat extends Animal {

	public Cat() {
		//생략된 실행 명령은? super(); 
		System.out.println("냐옹이가 생성되었습니다.");
	}
	
	@Override
	void sound() {
		System.out.println("😸😸야옹야옹웁니다."+getName());
		}
	
	
	
	
}
