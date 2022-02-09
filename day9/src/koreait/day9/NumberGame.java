package koreait.day9;

import java.util.Random;
import java.util.Scanner;

public class NumberGame {

	public static void main(String[] args) {

		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int number = r.nextInt(300) + 1;
		int[] numbers = new int[10];

		System.out.println("숫자 맞추기 게임 시작합니다. 나 컴퓨터는 숫자를 결정했습니다.(1~300)");
		System.out.println("너 휴먼은 맞춰보세요.(기회 10번)");
		int i;
		for (i = 0; i < numbers.length; i++) {
			System.out.print("생각한 숫자 입력 -> ");
			numbers[i] = sc.nextInt();
			if (number > numbers[i])
				System.out.println("아닙니다. 더 큰 값입니다.");
			else if (number < numbers[i])
				System.out.println("아닙니다. 더 작은 값입니다.");
			else {
				System.out.print("딩동댕 맞추셨습니다. 지금까지 시도한 값 ");
				for (int j = 0; j <= i; j++)
					System.out.print(numbers[j] + " ");
				System.out.println((i+1) + "번 만에 정답입니다.");
				break;
			}
			if (i == numbers.length-1) {
				System.out.println("기회를 모두 날렸습니다. 당신이 졌습니다.");
			}
		}
	}
}
