package day8_;

import java.util.Arrays;
import java.util.Random;

public class Ex1 { // 정수형 배열의 값 중에서 최대값/최소값 찾기

	public static void main(String[] args) {

		int[] numbers = new int[20];
		Random r1 = new Random();
		int max = 0;
		int min = 0;
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = r1.nextInt(100) + 1;
		}

		int j = 0;
		max = numbers[j];
		for (; j < numbers.length - 1; j++) {
			int temp = numbers[j + 1];
			if (max >= temp)
				max = max;
			else
				max = temp;
		}

		int k = 0;
		min = numbers[k];
		for (; k < numbers.length - 1; k++) {
			int temp = numbers[k + 1];
			if (min >= temp)
				min = temp;
			else
				min = min;
		}
		System.out.println("배열: " + Arrays.toString(numbers));
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	}

}
