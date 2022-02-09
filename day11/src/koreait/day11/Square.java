package koreait.day11;

public class Square extends Shape {
	protected String color;		//자식 클래스 Square만 갖는 필드.
								
//	public Square(String color) {
//			//super(); 자동 호출>오류
//			this.color=color;
//	}
	public Square(String shapeName, int width,int height,String color) {
		super(shapeName,width,height);
		this.color=color;
	}
	public Square(String color) {
		super("정사각형",10,10);
		this.color=color;
	}

	public void printWidth() {
		System.out.println("정사각형 너비= "+getWidth());
	}
	public void printEtc() {
		System.out.println("기타 정보: "+etc);
	}
	public int getArea() {		//오버라이드 메소드(메소드 재정의)
		return getWidth()*getWidth();
	}
	

}