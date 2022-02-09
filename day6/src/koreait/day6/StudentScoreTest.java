package koreait.day6;

public class StudentScoreTest {

	public static void main(String[] args) {
		//작성자 어민규.(01.05)
		StudentScore stu1 = new StudentScore();
		stu1.num = 1; stu1.name = "김일번";
		stu1.korean = 80; stu1.english = 76; stu1.science = 100;
		
		StudentScore stu2 = new StudentScore();
		stu2.num = 2; stu2.name = "김이번";
		stu2.korean = 77; stu2.english = 92; stu2.science = 80;
		
		StudentScore stu3 = new StudentScore();
		stu3.num = 3; stu3.name = "김삼번";
		stu3.korean = 50; stu3.english = 100; stu3.science = 95;
		
		StudentScore stu4 = new StudentScore();
		stu4.num = 4; stu4.name = "김사번";
		stu4.korean = 78; stu4.english = 78; stu4.science = 87;
		
		StudentScore stu5 = new StudentScore();
		stu5.num = 5; stu5.name = "김오번";
		stu5.korean = 89; stu5.english = 60; stu5.science = 86;

		stu1.printScore();
		stu2.printScore();
		stu3.printScore();
		stu4.printScore();
		stu5.printScore();
		
		System.out.println();
		System.out.println("다음은 학생별 총점입니다.");

		System.out.println(stu1.name+" 총점 : "+stu1.sum()+"점");
		System.out.println(stu2.name+" 총점 : "+stu2.sum()+"점");
		System.out.println(stu3.name+" 총점 : "+stu3.sum()+"점");
		System.out.println(stu4.name+" 총점 : "+stu4.sum()+"점");
		System.out.println(stu5.name+" 총점 : "+stu5.sum()+"점");

		System.out.println();
		System.out.println("다음은 학생별 평균점수 입니다.");
		
		System.out.printf(stu1.name+" 평균 : "+"%.2f점\n",stu1.avg());
		System.out.printf(stu2.name+" 평균 : "+"%.2f점\n",stu2.avg());
		System.out.printf(stu3.name+" 평균 : "+"%.2f점\n",stu3.avg());
		System.out.printf(stu4.name+" 평균 : "+"%.2f점\n",stu4.avg());
		System.out.printf(stu5.name+" 평균 : "+"%.2f점\n",stu5.avg());

		
	}

}
