package koreait.day10;

public class MyClass1 {
	int f1;
	String f2;
	double[] f3;
	public String f4;	//public 접근 권한
	
	public MyClass1() {
	//커스텀 생성자를 정의하면 기본 생성자는 생략을 할 수 없습니다.-> 필요하다면 기본 생성자 정의가 필요합니다.
	// -> 객체 생성할 때 new MyClass1() 허용하지 않겠다면, 13번 라인 쓰지 않습니다.
	}
	public MyClass1(int f1) {
		this.f1=f1;		//이 객체의 f1 필드값.this는 new 연산으로 만들어지는 객체.
	}
	public MyClass1(String f2) {
		this.f2=f2;
	}
	public MyClass1(double[] f3) {
		this.f3=f3;
	}
	public MyClass1(int f1, String f2, double[] f3) {
		this.f1=f1;
		this.f2=f2;
		this.f3=f3;
	}
	void print() {//default 접근권한
		System.out.println("f1 = "+ f1 + ", f2= "+f2+", f3= "+f3);
	}
	
	
}
