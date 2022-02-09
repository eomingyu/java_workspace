package day19_;

import java.util.Scanner;

public class ForTest {

	public static void main(String[] args) {
//1
		Scanner sc = new Scanner(System.in);
		System.out.println("팩토리얼 구하기");
		
		System.out.print("숫자를 입력하세요. -> ");
		int num = Integer.parseInt(sc.nextLine());
		int temp=1;
		for(int i=1;i<=num;i++) 
			temp*=i;
		System.out.println(temp);
		
		sc.close();
//2
		num=100;
		int cnt=0;
		for(int i=1;i<num;i++) {
			if(i%3==0)
				cnt++;
		}
		System.out.println(num+" 이하 3의 배수 개수 : "+cnt);
	}

}
