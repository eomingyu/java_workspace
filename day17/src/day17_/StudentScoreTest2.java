package day17_;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StudentScoreTest2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<StudentScore> stusList = new ArrayList<>();
		Random r = new Random();
		int max = 100, min = 10; // 각 과목 점수의 난수 발생 범위입니다.

		System.out.println("입력된 학생 인원수(1~10) 만큼 성적 데이터가 난수로 발생됩니다.");
		System.out.print("학생 인원 수를 입력해 주세요. -> ");
		int num;
		while (true) {
			num = Integer.parseInt(sc.nextLine());
			if (num > 10 || num < 1) {
				System.out.println("1~10을 입력하세요.");
				System.out.print("학생 인원 수를 입력해 주세요. -> ");
			} else
				break;
		}
		for (int i = 0; i < num; i++) {
			stusList.add(new StudentScore(i + 1, r.nextInt(max - min + 1) 
					+ min, r.nextInt(max - min + 1) + min, r.nextInt(max - min + 1) + min));

			System.out.println("국어, 영어, 과학 점수가 자동으로 입력되었습니다. 학생 이름을 입력해 주세요.");
			System.out.print("이름 -> ");
			stusList.get(i).setName(sc.nextLine());
		}

		System.out.println(":::::저장된 성적데이터를 확인하세요.:::::");
		DecimalFormat df = new DecimalFormat("###.00");
		for (StudentScore score : stusList) {
			//if (score != null) 	//ArrayList에서는 필요 없음.
			
				System.out.print(score);
				System.out.println("  -총점: " + score.sum() + " 평균 : " + df.format(score.avg()));
			
		}
		System.out.println("::::: 총점 기준 최우수 학생 이름과 점수입니다.:::::");
		int max_sum = stusList.get(0).sum();
		int max_idx = 0;
		for (int i = 1; i < num; i++) {		//num은 stusList.size()
			if (max_sum < stusList.get(i).sum()) {
				max_sum = stusList.get(i).sum();
				max_idx = i;
			}
		}
		System.out.println("최우수 학생 : " + stusList.get(max_idx).getName() + "(총점 :" 
				+ stusList.get(max_idx).sum() + ",평균 :" + df.format(stusList.get(max_idx).avg()) + ")");
		sc.close();
	}

}
