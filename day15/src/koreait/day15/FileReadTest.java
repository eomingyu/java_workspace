package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadTest {
//System.in : 표준 입력(콘솔/키보드 입력) 지금까지 입력은 표준 입력입니다. 이제는 파일 입력을 연습합니다.
	public static void main(String[] args) {
		//파일 입력 : 데이터를 파일에서 읽어옵니다.
		String filename = "C:\\dev\\test\\자바테스트.txt"; // 역슬래쉬 \는 \\로 해야합니다.
		//파일 객체를 생성합니다.
		File file = new File(filename);
		//file 변수가 참조하는 File 클래스 객체를 데이터 입력에 사용하기 위한 클래스는  Scanner입니다.
		try {
			Scanner fsc = new Scanner(file);
//			String temp = fsc.nextLine();	//행(line) 단위로 읽어옵니다.
//			System.out.println("읽어온 문자열: "+temp);
			System.out.println("-------------------------");
			while(fsc.hasNext()) {	//읽어올 라인이 있다면 true 없으면 false
				System.out.println(fsc.nextLine());
			}
			fsc.close();
		} catch (FileNotFoundException e) {
			System.out.println("없는 파일을 선택했습니다. ("+e.getMessage()+")");
		}
			
		
		
		
		
	}

}
