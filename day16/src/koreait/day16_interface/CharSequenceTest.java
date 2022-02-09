package koreait.day16_interface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

public class CharSequenceTest {
//자바의 CharSequence라는 인터페이스를 연습합니다. 인터페이스의 활용 예시입니다.
	public static void main(String[] args) {

		String result = new String();
		for(int i=2;i<5;i++) {
			result +=i+"/";			//result에 연결 연산 결과로 다른 문자열이 생성되면 주소 값이 달라진다.
			System.out.println(result);
			System.out.println(result.hashCode());
		}
		//문자열을 다루는 클래스입니다. 문자열 연결할 때 +대신에 append 메소드를 사용합니다.
		StringBuilder sb = new StringBuilder();
		for(int i=2;i<5;i++) {
			sb.append(i).append(":");	//문자열의 내용이 바뀌어도 객체 자체는 그대로입니다.
										// ㄴ 반복되는 연결 연산에 효율적입니다.
			System.out.println(sb);
			System.out.println(sb.hashCode()); //객체가 같으면 해시코드 값이 그대로이다.
		}
		//String 클래스 메소드에 인자로 CharSequence 타입인 것이 있습니다.
		//boolean java.lang.String.contains(CharSequence s)
		//	-> 인자의 실제 객체는 다른 클래스들로 만들어진 것들이 참조될 수 있습니다.
		String sample = "2/3/4/5/6/";
		System.out.println(sample.contains(result));
		System.out.println(sample.contains(sb));
		//인터페이스 적용 예시: List, Map 인터페이스이며 이를 구현한 구현 클래스가 여러가지입니다.
		//		-> 그 여러가지 중에 각각 ArrayList, HashMap을 사용하려고 하는 것입니다.
		List<String> names = new ArrayList<>();	//Vector 클래스도 List 인터페이스 구현 클래스
		names = new Vector<>();		//같은 변수명으로 다른 클래스 구현 객체를 참조할 수 있습니다.
		
		Map<String, Integer> map = new HashMap<>();
		map = new TreeMap<>();
	}

}
