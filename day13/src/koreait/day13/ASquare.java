package koreait.day13;

public class ASquare extends AShape{

		private int width;

		//테스트용 메소드
		public String square() {
			return "square - 정사각형";
		}
		public int getWidth() {
			return width;
		}
		public void setWidth(int width) {
			this.width = width;
		}
		
		//추상메소드 구형
		@Override
		public double getArea() {
			return width*width;
		}
	
	
	
	
}
