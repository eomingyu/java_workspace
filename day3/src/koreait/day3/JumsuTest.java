package koreait.day3;

import java.util.Scanner;

public class JumsuTest {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int korean, english, science, sum;
		
		
		System.out.println("[[성적 집계 : 평균과 총점 구하기]]");
		System.out.println("성적 입력하세요.");
		System.out.print("국어 -> ");
		korean = sc.nextInt();	//국어 점수값 입력
		System.out.print("영어 -> ");
		english = sc.nextInt();	//영어 점수값 입력
		System.out.print("과학 -> ");
		science = sc.nextInt();	//과학 점수값 입력
		System.out.println("\n>>처리되었습니다.");
		
		sum = korean + english + science;
		System.out.println("총점 : " + sum);
		System.out.printf("평균 : %d(%.2f)",sum/3 ,(double)sum/3);
		
		sc.close();
		
	}

}
