package koreait.day15;

import java.util.Arrays;
import java.util.Random;

public class RandomPrimeNum {

	public static void main(String[] args) {
		// 주어진 난수 범위에서 소수가 7개 만듭니다. (난수가 소수인지 판별해서 그 값이 7개가 되면 반복 종료.)
		// 소수 7개는 배열에 저장하여 출력합니다.
		// -> 주어진 정수값이 소수인지 판별하는 메소드를 만들어 봅시다.
		// (메소드 이름 isPrime, 리턴형식은 boolean, 인자는 정수 1개)
		// 범위 100~999 > 수식 만들어서 하세요

		int[] primes = new int[7];
		Random r = new Random();

		for (int i = 0; i < primes.length; i++) {
			int ran;
			do {
				ran = r.nextInt(900) + 100;
				if (isPrime(ran)) {
					primes[i] = ran;
				}
			} while (!isPrime(ran));
		} // for-end
		Arrays.sort(primes);
		System.out.println(Arrays.toString(primes));
	} // main-end

	// 메소드부터 만들어보세요.
	static boolean isPrime(int num) {
		boolean prime = true;
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0) {
				prime = false;
				break;
			}
		}
		return prime;
	}

}
