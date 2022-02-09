package koreait.day6;

public class StudentScore {

	int num;
	String name;
	int korean, english, science;
	
	
	void printScore() {
		System.out.println("번호 : "+num+", 이름: "+name+",  국어점수: "
				+korean+", 영어점수: "+english+", 과학점수: "+science);
	}
	int sum( ) {
		return (korean+english+science);
	}
	double avg( ) {
		return (double)(korean+english+science)/3;
	}
	
	
}
