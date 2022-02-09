package koreait.day16_interface;

//이 클래스는 2개의 인터페이스를 사용합니다. - 결론: 상속은 다중 상속이 불가합니다. 인터페이스는 다중 구현이 가능합니다.
public class MyClassAB implements InterfaceA,InterfaceB{

	//InterfaceB의 추상메소드 구현
	@Override
	public void methodBa() {
		
	}
	//InterfaceA의 추상메소드 구현
	@Override
	public int methodB(int num) {
		return 0;
	}

	@Override
	public void methodA() {
		
	}

}
