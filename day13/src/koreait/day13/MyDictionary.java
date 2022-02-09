package koreait.day13;

import java.util.Scanner;
import java.util.TreeMap;

public class MyDictionary {

	public static void main(String[] args) {
		TreeMap<String, String> word = new TreeMap<>();
		Scanner sc = new Scanner(System.in);
		String eng, kor;
		String num;
		System.out.println("선택 기능: 1. 단어저장	2. 단어검색	3.단어장보기	4.프로그램 끝내기");
		boolean run = true;
		while (run) {	//while 반복 안에 switch로 종료 조건을 동작시킬 때 break로 못합니다.-> 변수 사용.
			System.out.print("선택 ✏️ ->  ");
			num = sc.nextLine();
			switch (num) {
			case "1":
				System.out.print("English -> ");
				eng = sc.nextLine();
				System.out.print("Korean -> ");
				kor = sc.nextLine();
				if(word.containsKey(eng)) {		//이미 저장된 단어에 다른 뜻 입력할 경우
					String temp = word.get(eng);
					temp +=", "+ kor;
					word.put(eng, temp);
				}
				else word.put(eng, kor);
				break;

			case "2":
				System.out.print("English -> ");
				eng = sc.nextLine();
				System.out.println("단어장에 검색했습니다. -> " + word.get(eng));
				break;

			case "3":
				System.out.println("단어장 전체 보기"+word);
				break;
			case "4":
				run = false;
				break;
			default:
				System.out.println("잘못된 입력입니다.1~4를 입력하세요.");
				break;

			}
		}	//while end
		System.out.println("::: 단어장 종료 :::");
	sc.close();
	}
}