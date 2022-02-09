package koreait.day12;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {
//java.util.ArrayList 클래스를 사용해서 배열보다 편하게 데이터를 저장/접근합니다. -자료구조, 알고리즘

	public static void main(String[] args) {
		int [] datas = {1,5,7,9,11};	//1) 배열은 선언된 정해진 크기에 따라 사용해야 합니다.
										//*기본형 타입으로 선언합니다.
										//2) 배열은 새로운 데이터를 중간 위치에 추가/삭제할 때 for문으로 직접 코딩합니다.
										 
		
		ArrayList<Integer> intList = new ArrayList<>();	//나중에 변수의 참조타입을 변경합니다.
										//1) 크기는 데이터를 추가할 때마다 증가됩니다.(삭제할 때마다 감소)
										//*기본형 데이터는 Integer: 래퍼클래스 사용, <>는 제너릭 타입을 지정하는 기호
										//2) add(), remove() 메소드로 추가/삭제합니다.
										
	
		//공통점: 배열과 동일하게 index로 위치를 표시합니다.
		
		intList.add(1);	//데이터는  마지막 위치에 추가
		intList.add(5);
		intList.add(7);
		intList.add(9);
		intList.add(11); // 이 위치의 상태: 1,5,7,9,11
		System.out.println(intList);	//3)출력결과로 ArrayList 클래스의 toString 메소드는 오버라이드 되어 있습니다.
		System.out.println(datas);		//3)배열 변수는 참조 값을 저장하지만 클래스 타입 아니고 toString()은 참조주소와 관련된 값 출력
		System.out.println(Arrays.toString(datas));
		System.out.println("list의 크기: "+intList.size());	//5
		
		
		intList.add(2,99); //데이터는 2번 인덱스 위치에 추가
		System.out.println(intList);	
		System.out.println("list의 크기: "+intList.size());	//6
		
		//삭제
		intList.remove(3);	//인덱스 3 위치 삭제
		System.out.println(intList);	
		System.out.println("list의 크기: "+intList.size());	//5
		
		//특정 인덱스 위치 값 가져오기
		int temp = intList.get(3);
		System.out.println("인덱스 3 데이터: "+temp);
		System.out.println("인덱스 2 데이터: "+intList.get(2));
		
		//contains 메소드
		System.out.println(intList.contains(99));
		System.out.println(intList.contains(100));
		
		//intList의 모든 값을 index-..element=.. 형식으로 출력해보세요 -> for문(반복횟수는 데이터 개수 만큼)
		for(int i=0;i<intList.size();i++) {
			System.out.println("index= "+i+", element= "+intList.get(i));
		}
		
		
		
	}

}
