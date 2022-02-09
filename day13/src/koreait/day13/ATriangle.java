package koreait.day13;

public class ATriangle extends AShape {
	//추상 클래스를 상속 받으면 추상 메소드가 반드시 구현되어야합니다.
	private int height;
	private int width;
	
	@Override	//(오버라이딩보다는 implements(구형)로 불립니다.) 정의가 안된 메소드 ->실행 내용 정의합니다.
	public double getArea() {
		return width*height/2;
	}
	//테스트용 메소드
	public String triangle() {
		return "triangle - 삼각형";
	}
// getter setter
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setWidth(int width) {
		this.width = width;
	}




}
