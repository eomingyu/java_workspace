package day8_;

import java.util.Random;

public class Ex2 {	//LottoTest.java의 while문을 do~ while 문으로 변경해보세요.
					//-> isOk 변수 사용하지 않습니다.

	public static void main(String[] args) {
		int [] lotto = new int[6];
		Random r1 = new Random();
		
		for(int i=0; i<6;i++) {
			int temp=0;
			
		do {
		temp = r1.nextInt(45)+1;
		System.out.println("만든 값: "+temp );

		int j;
		for(j=0;j<i;j++) {
		if(temp==lotto[j]) {
			System.out.println("*이전의 값과 중복*");
			break;
			}
		}
			if(j==i) break;
		}while(true);
		
		lotto[i] = temp;
		}
		
	}

}
