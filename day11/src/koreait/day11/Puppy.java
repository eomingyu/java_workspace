package koreait.day11;

public class Puppy extends Animal {
	//필드
	private String type;
	
	//getter
	public String getType() {
		return type;
	}
	//setter
	public void setType(String type) {
		this.type = type;
	}
	public void test() {
		System.out.println("Puppy : test 메소드");
	}
	
	//메소드 재정의
	@Override	//@ 어노테이션은 명령 실행에 도움을 주는 주석입니다. 
	void sound() {
		System.out.println("🐶🐶 멍멍합니다.");
	}
	
	
	
}
