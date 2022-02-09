package koreait.day7;

import java.util.Arrays;
import java.util.Random;

public class IntArrayTest {	//정수값 배열을 연습합니다.
	//배열을 쓰는 이유: 일반 변수는 변수 1개에 데이터 1개를 저장합니다. 많은 데이터를 저장할 때 변수를 많이 선언하지 않고 배열을 사용합니다.

	public static void main(String[] args) {
		//배열 변수 선언
		//1)초기화를 같이 합니다.
		int[] arr1 = {78,65,89,94};	// [] 배열 기호, { } 배열값을 나열
				//배열의 크기: 4 (4개 * 4바이트 = 16바이트)
		//2)초기화 없이(기본값은 0) 배열의 크기만 정합니다.
		int[] arr2 = new int[10];	
		
		//배열은 객체와 유사한 성격입니다. arr1, arr2는 참조변수(배열값들이 저장된 주소를 변수가 저장합니다.)
		
		System.out.println("arr1 배열 길이(크기) : "+ arr1.length);
		System.out.println("arr2 배열 길이(크기) : "+ arr2.length);
		
		System.out.println("arr1 배열 3번째 데이터의 값 : " + arr1[2]); //값? 89
		System.out.println("arr2 배열 3번째 데이터의 값 : " + arr2[2]); //값?  0
		//배열 데이터의 위치(숫자0부터 시작): 인덱스, 기호[] 사용
		
		//arr1 배열의 모든 값을 출력하고 싶다. 배열의 친구 : for문
		for(int i=0;i<arr1.length;i++) {	//i<arr1.length는 배열이 크기가 변경되어도 잘 실행될 수 있습니다.
			System.out.println("arr1[" + i + "]의 데이터 값 : " + arr1[i]);	//arr1[i]는 i번째 위치 배열
		}
		
		//배열 특정 위치에 데이터를 저장합니다. arr2배열 5번째 위치에 78을 저장해보세요.
		arr2[4] = 78;
		System.out.println("arr2 배열 5번째 데이터의 값 : " + arr2[4]);		
		
		//1)Random 클래스로 1~46 범위의 값을 난수로 만들어서 arr2배열에 10개 저장하기.
		Random r1 = new Random();
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=r1.nextInt(46)+1;
		}
		
		//2)arr2 배열의 모든 값을 출력하기: 줄바꿈 없이 하세요.(공백으로 구분)
		System.out.println("1~46 범위의 난수를 만듭니다.");
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i] + " ");
		}
		//** 2)번의 출력을 한번에 하는 방법 Arrays 클래스 사용합니다.
		System.out.println("\n" + Arrays.toString(arr2));		//arr2 배열의 값으로 문자열 반환
		System.out.println(arr2);				//출력값은? [I@372f7a8d 해시코드라는 식별값
		//발전방향: arr2 배열의 난수값 만들 때 중복된 값은 제외합니다. 그리고 6개를 한 쌍으로 5번 만듭니다. -> Lotto
		
	}

}
