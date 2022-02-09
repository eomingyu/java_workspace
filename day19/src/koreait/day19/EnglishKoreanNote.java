package koreait.day19;

import java.awt.FileDialog;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.JFrame;
//EnglishKoreanNote 클래스는 WordNote 인터페이스 규칙(추상 메소드)를 따르고 그의 그룹이 됩니다.
public class EnglishKoreanNote implements WordNote {
	// 전역변수 선언
	private Scanner sc = new Scanner(System.in);
	private List<Word> mywords = new ArrayList<>();	//단어들의 목록(단어장)
	
	//1. 인스턴스 메소드 - 재정의
	public  void start() { // 애플리케이션 클래스
		JFrame f = new JFrame();
		FileDialog fd;
		boolean run = true;
		while (run) {
			System.out.println("선택 기능 👉   1. 단어저장     2. 단어장보기    3. 파일에 저장  4. 파일에서 불러오기  5.프로그램 끝내기");
			System.out.print("선택 -> ");
			String sel = sc.nextLine();
			String filename;	// = "C:\\dev\\test\\mydict.txt";
			switch (sel) {
			case "1":
				wordAdd();
				break;
			case "2":
				wordList();
				break;
			case "3":
				fd = new FileDialog(f, "파일저장", FileDialog.SAVE);
				fd.setVisible(true);
				filename = fd.getDirectory()+fd.getFile();
				wordSave(filename);
				break;
			case "4":
				fd = new FileDialog(f,"파일 열기",FileDialog.LOAD);	
				fd.setVisible(true);
				filename = fd.getDirectory() + fd.getFile();
				wordRead(filename);
				break;
			case "5":
				run = false;
				break;
			default:
				System.out.println(":::: 잘못된 선택입니다. ::::");
				break;
			}

		} // while end
		System.out.println(":::: 프로그램 종료합니다. ::::");
	}// main end

	public void wordAdd() { // 단어 추가
		System.out.println("[새로운 단어 추가]입니다.");
		do {
			System.out.print("English ->");
			String eng = sc.nextLine();
			System.out.print("우리말 뜻 ->");
			String kor = sc.nextLine();
		
			List<String> koreans;
			int index =-1;						//boolean flag = false;
			for (int i = 0; i < mywords.size(); i++) {
				Word w = mywords.get(i);
				if (w.getEnglish().equals(eng)) {	//단어장에 있는 단어일 때
					index=i;					//flag= true;
					koreans=w.getKoreans();	//이미 존재하는 리스트 객체를 가져와서 koreans 변수가 참조합니다.
					koreans.add(kor);
					break;
				} 
			} // for end					
			if(index==-1) {						//if(!flag)	
				koreans = new ArrayList<>();
				koreans.add(kor);
				mywords.add(new Word(eng,koreans));
			}
			// 입력받은 eng가 mywords 리스트에 있느냐?
			// 있다면 - 몇 번째 인덱스인지 알아내서 kor 담기,없다면 - kor 추가할 리스트 생성해서 담기

			System.out.print("단어 추가 계속 하시겠습니까?(y or n) -> ");
		} while (sc.nextLine().equals("y"));
	}

	public void wordList() {// 단어 목록
		for (Word w : mywords) {
			System.out.println(w);
		}
	}

	public void wordSave(String filename) {// 파일에 단어들을 저장합니다.
		File file = new File(filename);
		
		try {
			PrintWriter pw = new PrintWriter(file);
				for(Word w : mywords)
					pw.println(w);
				
				pw.close();
				System.out.println("파일 저장이 완료되었습니다.");
		} catch (FileNotFoundException e) {
				System.out.println("없는 경로 또는 파일입니다.");
		} 
	}

	public void wordRead(String filename) {// 파일에서 단어들을 읽어옵니다.
		File file = new File(filename);
		
		try {
			Scanner fsc = new Scanner(file);
			
			while(fsc.hasNext()) {	//파일 읽기 -> mywords 리스트에 저장할 객체로 생성합니다.
				//System.out.println(fsc.nextLine());
				StringTokenizer stk = new StringTokenizer(fsc.nextLine(),":[]");
				while(stk.hasMoreTokens()) {	//파일에서 1라인씩 읽어오고 그것을 토큰화하기. -> Word 객체 생성할 필드값
					//System.out.println(stk.nextToken(":["));
					Word w = new Word(stk.nextToken());		//첫 번째 토큰을 english 필드값 저장
					List<String> kor = Arrays.asList(stk.nextToken().split(", ")); //split 결과 타입 배열을 리스트에 저장.
					kor = new ArrayList<>(kor);	//고정리스트를 변경할 수 있는 리스트 객체로 생성하기
					w.setKoreans(kor);		//두 번째 토큰을 리스트로 변환해서 koreans 필드값으로 참조.
					mywords.add(w);
				}
			}
			fsc.close();
		} catch (FileNotFoundException e) {
			System.out.println("없는 경로 또는 파일입니다.");
		}
	}

}
