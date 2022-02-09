package koreait.day2;

public class ShapeTest {

	public static void main(String[] args) {
		//변수 사각형 넓이 구하기
		int width; 
		int height; 
		int area;
		
		width = 23;
		height = 19;
		area = width * height;
		System.out.println("[[사각형 도형의 넓이 구하기]]");
		System.out.println("가로: " + width + "cm" );
		System.out.println("세로: " + height + "cm" );
		System.out.println("넓이를 구했습니다. -> " + area + "㎠");
		
		//원의 둘레, 넓이 구하기 (소수점 이하 3자리까지 구하기)
		double radius;
		double round;
		double c_area;
		
		radius = 23; 			//int형 데이터가 double형으로 자동 변환
		round = 2 * 3.14 * radius;
		c_area = 3.14 * radius * radius;
		System.out.println("[[원 도형의 넓이와 둘레 구하기]]");
		System.out.printf("반지름: %.1f cm\n", radius);		//%d는 정수 데이터 서식>radius는 double형이라 불가능
		System.out.printf("둘레를 구했습니다. -> %.3fcm\n", round); //**** %f는 소수점
		System.out.printf("넓이를 구했습니다. -> %.3f㎠\n", c_area);
			
	
	}

}
