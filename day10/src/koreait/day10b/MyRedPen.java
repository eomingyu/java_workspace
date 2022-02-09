package koreait.day10b;

import java.util.Random;
import java.util.Scanner;

public class MyRedPen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int[] x1=new int[10];
		int[] x2=new int[10];
		int[] no=new int[10];
		int n1,n2,ans;
		int cnt=0;
		System.out.println("---------------------");
		System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
		System.out.println("---------------------");
		System.out.println("시작합니다.");

		for (int i = 0; i < 10; i++) {
			n1=r.nextInt(89)+11;	//nextInt(max-min+1)+min
			n2=r.nextInt(89)+11;
			System.out.print("문제 " + (i+1) + ". " + n1 + " + " + n2 + " =  답 입력 -> ");
			ans=sc.nextInt();
		//	if(ans == n1+n2) cnt++;
			if (ans!=n1+n2) {
				x1[cnt]=n1;
				x2[cnt]=n1;
				no[cnt]=i+1;
				cnt++;
			}	//틀린 개수는 cnt, 맞은 개수는 10-cnt -> 문제 총 10개
		}

		System.out.println("---------------------");
		System.out.println("채점합니다. 맞은 개수"+(10-cnt)+"("+((10-cnt)*10)+"점)");
		System.out.println("::::: 틀린 문제 다시보기 :::::");
		for (int i = 0; i < cnt; i++)
		System.out.println("문제 " + no[i] + ". " + x1[i] + " + " + x2[i] + " = "+(x1[i]+x2[i]));
	
	}

}
	//발전방향: x1,x2,no 베열 >2차원 배열(단순히 값만 저장), 클래스(값저장+메소드)