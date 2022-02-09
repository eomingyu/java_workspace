package koreait.day4;

import java.util.Scanner;

public class MaxMinValueEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1, n2, n3, max, min;
		
		System.out.println("n1,n2,n3에 저장할 값 3개를 입력하세요.");
		System.out.print("n1 -> ");
		n1=sc.nextInt();
		System.out.print("n2 -> ");
		n2=sc.nextInt();
		System.out.print("n3 -> ");
		n3=sc.nextInt();
		
		if(n1 > n2) {	//삼항연산으로 변경하면?
			max = n1;	//max = (n1>n2)? n1:n2;
			min = n2;	//min = (n1<n2)? n1:n2;
		}
		else {
			max = n2;
			min = n1;
		}
		if(max < n3)	//max = (max<n3)? n3:max;
			max = n3;	//min = (min>n3)? n3:min;
		if(min > n3)
			min = n3;
		System.out.println("최대값 = " + max);	
		System.out.println("최소값 = " + min);	
	}

}
//Package Explorer에서 class 클릭후 F2 누르면 이름 변경 가능