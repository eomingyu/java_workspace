package koreait.day10b;

import java.util.Scanner;

public class NumberGameStartMe {
//NumberGame 실행 - 게임 기록 저장
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		NumberGame[] result = new NumberGame[5];	//게임 기록을 저장
		int k=0;
		
		System.out.println("숫자 맞추기 게임입니다.");
		
		do {
			System.out.print("게임을 시작하려면 너 휴먼의 이름을 쓰시오 -> ");
			String gamer = sc.nextLine();
			NumberGame ng = new NumberGame(gamer);	//gamer대신 sc.nextLine() 가능
			int[] numbers = new int[10];
			System.out.println("이제 시작합니다. 나 컴퓨터는 숫자를 결정했습니다.");
			int random = ng.makeNumber(101, 200);
			
			System.out.println("너 휴먼은 맞춰보세요.(101~200)");
			
			int i = 0;

			do {
				System.out.print("생각한 숫자 입력 (기회 : " + (10 - i) + ") -> ");
				numbers[i] = sc.nextInt();
				if (random > numbers[i]) {
					System.out.println("아닙니다. 더 큰 값입니다.");
				} else if (random < numbers[i]) {
					System.out.println("아닙니다. 더 작은 값입니다.");
				}
				else
					ng.setSuccess(true);
				i++;
				if (i == 10) 	break;
			} while (random != numbers[i-1]);
			
			ng.setCount(i);
			if(ng.isSuccess()) {
				System.out.print("딩동댕 맞추셨습니다. 지금까지 시도한 횟수 ");
				for(int j=0;j<i;j++) {
					System.out.print(numbers[j]);
					System.out.print((j!=(i-1)?", ":"")); //
				}
				System.out.println(".."+ng.getCount()+"번 만에 정답입니다.");
			}else {
				System.out.println("실패. 모든 기회를 다 사용했습니다.");
				System.out.println("정답은 "+random+" 입니다.");
			}
			result[k]=ng;
			k++;
			System.out.print("게임을 계속 하시겠습니까? 계속하려면 0을 입력하세요.->");
		}while(sc.nextInt()==0);
		//게임 기록 result 배열 출력
		System.out.println("::::: 게임스코어 :::::");
		for(int j=0;j<k;j++)
			result[j].print();
		System.out.println("::::: Game End :::::");
		
		
		
		
		
		
		
		
		
	}

}
