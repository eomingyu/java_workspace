 package koreait.day12;

import java.util.ArrayList;
import java.util.Scanner;

public class MyRedPenV3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer;

		do {
			ArrayList<MathProblem> addList = new ArrayList<>();
			System.out.println("---------------------");
			System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
			System.out.println("---------------------");
			System.out.println("시작합니다.");

			int cnt = 0;
			for (int i = 0; i < 10; i++) {
				MathProblem p1 = new MathProblem('+');
				p1.makeProb();
				System.out.print("문제"+(i+1)+".	"+p1);
				answer = sc.nextInt();
				if (answer == p1.showAnswer()) {
					p1.setCorrect(true);
					cnt++;
				}
					addList.add(p1); 				// 문제 저장
					p1.setMyAnswer(answer);			//입력값 저장
			} // for end
			System.out.println("채점합니다. 맞은 개수 :" + cnt + "개 (" + (cnt * 10) + "점)");
			System.out.println("::::: 틀린 문제 보기 :::::");
			for (MathProblem prob : addList) {
				if (!prob.isCorrect()) {
					System.out.println(prob + " 정답 : " + prob.showAnswer() 
						+"\t내가 입력한 답: " + prob.getMyAnswer());
				}
			} // for end
			System.out.print("계속하시겠습니까? 계속하려면 0, 종료하려면 다른 숫자를 입력하세요. -> ");
		} while (sc.nextInt() == 0);
		System.out.println("-------------------");
		System.out.println("수고하셨습니다. 종료합니다.");
		//계속 할까요? -> 연산자를 선택할 수 있도록 그기능을 추가해서 V4를 만들어 보세요. 주말미션입니다.
		
		sc.close();
	}

}
