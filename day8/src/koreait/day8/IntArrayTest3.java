package koreait.day8;

import java.util.Arrays;
import java.util.Random;

public class IntArrayTest3 {
	//IntArrayTest 첫 번째 예제는 day7 프로젝트에 있습니다.
	// int 값 저장하는 배열을 활용하는 연습입니다.-(2)
	public static void main(String[] args) {

		// 배열의 크기는 20 -> 메모리할당
		int[] scores = new int[20];

		// 배열의 값은 난수 1~100 범위
		Random r1 = new Random(System.currentTimeMillis());
		for (int i = 0; i < scores.length; i++)
			scores[i] = r1.nextInt(100) + 1;

		System.out.println(Arrays.toString(scores));
		//90~100, 80~89, 70~79, 70 미만의 범위의 값의 분포 개수를  출력합니다.
		int cntA = 0;	//90~100
		int	cntB = 0;	//80~89
		int	cntC = 0;	//70~79
		int	cntD = 0; 	//70미만
		
		for (int i = 0; i < scores.length; i++) {
			if (scores[i]>=90)			//&& 연산 안해도 된다!!!!!!!
				cntA++;	
			else if(scores[i]>=80) 
				cntB++;	
			else if(scores[i]>=70) 
				cntC++;	
			else
				cntD++;
		}	
		
		//결과 출력
		System.out.println("점수 분포 요약-------");
		System.out.println("90~100 : " + cntA);
		System.out.println("80~89  : " + cntB);
		System.out.println("70~79  : " + cntC);
		System.out.println("70미만    : " + cntD);
		
	}

}
