package koreait.day14;

import java.util.Arrays;

public class OverLoadingTest {

	public static void main(String[] args) {
		//메소드 오버로딩 예제입니다.
		
		//min 메소드는 int, long, double 등 여러 형식 인자를 전달 받습니다.->메소드 오버로딩
		int r1 = Math.min(134, 56);		//인자에 따라 리턴타입이 다른 메소드입니다.
		double r2 = Math.min(1.34, 5.67);
		
		System.out.println("r1="+r1);
		System.out.println("r2="+r2);
		
		int[] arr1 = {67, 45,99,12};
		String[] arr2 = {"sana", "momo", "나연", "다현"};
		double[] arr3 = {7.8, 3.4, 9.9, 12.34};
		
		String r3 = Arrays.toString(arr1);	//toString 메소드 리턴 타입이 String입니다.
		String r4 = Arrays.toString(arr2);
		String r5 = Arrays.toString(arr3);
		
		System.out.println("r3 문자열  = "+r3);
		System.out.println("r4 문자열  = "+r4);
		System.out.println("r5 문자열  = "+r5);
		
		//인자의 타입이 Object일 때는 모든 클래스 타입이 됩니다.(String, Member,...)
		//Object는 자바 클래스의 단군 할아버지(최상위 부모 클래스)
		
		Member[] arr4 = {new Member("ss",12), new Member("tt",21), new Member("qq",19)};
		
		String r6 = Arrays.toString(arr4);
		System.out.println("r6 문자열 = "+r6);
		
		//내가 만든 MyMath 오버로딩 메소드를 테스트합니다. - arr1 정수 배열, arr3 실수 배열로 해보세요
		System.out.println("arr1 배열 최대값 = "+ MyMath.arrayMaxValue(arr1));
		System.out.println("arr3 배열 최대값 = "+ MyMath.arrayMaxValue(arr3));
		System.out.println("arr1 배열 평균 = "+ MyMath.arrayAvgValue(arr1));
		System.out.println("arr3 배열 평균 = "+ MyMath.arrayAvgValue(arr3));
		
		
	}

}
