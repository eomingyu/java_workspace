package koreait.day11;

public class Animal {
	//필드
	private String color;
	private String name;
	//생성자
	public Animal() {
		System.out.println("Animal:새로운 반려동물 가족이 생겼습니다.");
	}
	//getter
	public String getColor() {
		return color;
	}
	public String getName() {
		return name;
	}
	//setter
	public void setColor(String color) {
		this.color = color;
	}
	public void setName(String name) {
		this.name = name;
	}
	//메소드
	void sound() {
		System.out.println("Animal:소리를 내는 동물입니다. 이름은 "+name);
	}
}
