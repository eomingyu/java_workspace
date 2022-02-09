package koreait.day8;

import java.util.Arrays;
import java.util.Random;

public class IntArrayTest4 {
	//IntArrayTest 첫 번째 예제는 day7 프로젝트에 있습니다.
	// int 값 저장하는 배열을 활용하는 연습입니다.-(2)
	public static void main(String[] args) {

		// 배열의 크기는 20 -> 메모리할당
		int[] scores = new int[20];

		// 배열의 값은 난수 1~100 범위
		Random r1 = new Random(System.currentTimeMillis());	//계속해서 바뀌는 현재시간을 사용해 seed값을 계속 바꾼다.
		for (int i = 0; i < scores.length; i++)
			scores[i] = r1.nextInt(100) + 1;

		System.out.println(Arrays.toString(scores));
		//90~100, 80~89, 70~79, 60~69, 50~59, 40~49, 40미만의 범위의 값의 분포 개수를  출력합니다.
		//분포가 더 다양하다면?  변수가 더 많이 필요합니다.
			int [] cntS = new int[7];
			//위의 분포 순서대로 인덱스 사용
		
		for (int i = 0; i < scores.length; i++) {
			if (scores[i]>=90)		cntS[0]++;	
			else if(scores[i]>=80)	cntS[1]++;	
			else if(scores[i]>=70)	cntS[2]++;	
			else if(scores[i]>=60)	cntS[3]++;	
			else if(scores[i]>=50)	cntS[4]++;	
			else if(scores[i]>=40)	cntS[5]++;	
			else					cntS[6]++;
		}	
		
		//결과 출력 : 연습문제  - 출력을 반복문으로 수정하기(90 100 80 89 숫자를 수식으로 가능?)
		System.out.println("점수 분포 요약-------");
		System.out.println("90~100 : " + cntS[0]);
		System.out.println("80~89  : " + cntS[1]);
		System.out.println("70~79  : " + cntS[2]);
		System.out.println("60~69  : " + cntS[3]);
		System.out.println("50~59  : " + cntS[4]);
		System.out.println("40~49  : " + cntS[5]);
		System.out.println("40미만    : " + cntS[6]);
		System.out.println(System.currentTimeMillis());
	}

}
