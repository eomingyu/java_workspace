package koreait.day4;

public class SumTest {

	public static void main(String[] args) {	//for문을 이용하여 1부터 100까지 합계
		int sum=0;
		for(int i=1;i<=100;i++) {
			sum+=i;	//sum = sum + i
			System.out.println("i =" + i + ", sum = " + sum);	//중간결과값
		}
		System.out.println("sum = " + sum);
		
	}

}
