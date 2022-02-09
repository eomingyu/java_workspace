package koreait.day12;

public class Member {
	int id;
	String name;
	
	public Member() {

	}
	public Member(int id, String name) {
			this.id=id;
			this.name=name;
	}
	
	void print() {	//toString 재정 해서 사용합니다.
		System.out.println("id: "+id+", name: "+name);
	}

	@Override
	public String toString() {	//최상위 클래스 Object의 toString() 재정의 해서 사용합니다.
		return "id=" + id + ", name=" + name;
	}
	//Alt+Shift+S > S
	
}


