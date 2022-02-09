package koreait.day8;

public class StringMethod2 {

	public static void main(String[] args) {

		//1. indexOf : contains 처럼 특정 문자열을 찾아서 시작 위치값을 반환.
		String msg = "milku@naver.com";
		System.out.println("naver의 시작위치 : "+msg.indexOf("naver"));
		System.out.println("gamil의 시작위치 : "+msg.indexOf("gmail")); //반환값은? 해당 문자열이 없을 때 -1 반환.
		
		msg = "ku naver ku naver";
		System.out.println("마지막 naver의 시작위치 : "+msg.lastIndexOf("naver"));
		
		//2.문자열의 첫 부분 또는 마지막 부분을 검사
		System.out.println("milku로 시작하는가? " + msg.startsWith("milku"));
		System.out.println("ku로 시작하는가? " + msg.startsWith("ku"));
		
		System.out.println("ver로 끝나는가? " + msg.endsWith("ver"));
		System.out.println("@로 끝나는가? " + msg.endsWith("@"));
		
		//3.문자열의 일부분 추출
		String temp;
		msg = "i like java";
		temp = msg.substring(4);
		System.out.println("substring(4) : " + msg.substring(4));
		temp = msg.substring(4,8);		//4번부터 (8-4) = 4개 또는 4번부터 (8-1)=7번까지 추출
		System.out.println("substring(4,8) : " + msg.substring(4,8));
		//문제: java 추출하려면 substring 메소드 인자는?
		System.out.println("substring(7) : " + msg.substring(7));
		//문제: like 추출하려면 substring 메소드 인자는?
		System.out.println("substring(2,6) : " + msg.substring(2,6));
		
		int start = msg.indexOf("like");
		int len = "like".length();
		temp = msg.substring(start, start+len);
		System.out.println("start : "+start + ", len : "+len+", 추출결과 : "+ temp);
		
		//4. 문자열 치환하기(바꾸기)
		msg = "milku2022@naver.com - 2022";
		temp = msg.replace("2022", "1999");
		System.out.println("replace 결과: "+ temp);
		temp = msg.replace("naver", "tistory");
		System.out.println("replace 결과: "+ temp);
		
		
		//msg 문자열에서 "치킨"이 몇 번 나오는지 출력해봅시다.
		msg = "그는 오늘 그녀와 치킨을 먹는다. 치킨 브랜드는... 치킨의 재료 원산지는 브라질산이다.";
		
		int idx; //치킨의 위치 저장.
		int cnt = 0;
		temp=msg;
		String find = "치킨";
		while(true) {
			idx = temp.indexOf(find);
			if(idx==-1) break;
			cnt++;
			temp = temp.substring(idx+find.length()); //첫번째 치킨 뒤부터 문자열 추출
		}
		
		System.out.println(find + "을 찾은 횟수 : "+ cnt);
	}

}
