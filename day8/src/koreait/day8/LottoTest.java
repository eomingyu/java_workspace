package koreait.day8;

import java.util.Random;

public class LottoTest {

	public static void main(String[] args) {
		// 난수 1~ 45 범위의 값을 중복된 값이 없도록 6개 생성하고 배열에 저장합니다.

		int[] lotto = new int[6];
		Random r1 = new Random();
		boolean isOk = true;

		for (int i = 0; i < 6; i++) {
			int temp = 0;
			isOk = true;	//새로운 i인덱스로 검사할 때 초기화
			while (isOk) { //다른방법 isOk 안쓰고 true /33라인
				temp = r1.nextInt(45) + 1; // 1~45
				System.out.println("만든 값:"+ temp);
				int j;
				
				for (j = 0; j < i; j++) {	//j==i이면 for 종료합니다.
					// 현재 배열 인덱스 i의 앞에 있는 배열값들과 temp 값을 비교
					if (temp == lotto[j]) {
						System.out.println("*이전의 값과 중복*");
						break; // for-j에서 탈출
								//i=4로 예를 들면, 1)j가 2의 배열값이 temp와 같다면
								//for-j를 탈출했을때 아래 if문의 조건은 거짓!
								//2) j=0~3까지 배열값 비교했을 때 모두 temp와 다른 값이라면
								//아래 if문은 참(i=j=4)
					}
				} // for j-end
				if (j == i)					//비교하는 동안 같은 값이 없을 때
					isOk = false;			//다른방법  이 줄 대신 break;
											
			} // while end
			lotto[i] = temp;
		} // for i-end

	}

}
//배열에서 중복을 제거