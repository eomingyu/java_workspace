package koreait.day14;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalCommunity2 {
	//작성자: 어민규
	public static void main(String[] args) {
		//AnimalCommunity 클래스 실행 내용을 ArrayList 활용하여 구현합니다.
		ArrayList<Animal> aniList = new ArrayList<>();
		aniList.add(new Puppy("브라우니", "Brown"));
		aniList.add(new Cat());
		aniList.add(new Rabbit("바니바니", "White"));
		aniList.get(1).setName("낭이");
		aniList.get(1).setColor("Black");
		aniList.add(new Puppy());
		
		System.out.println("[[환영합니다. 반려동물을 보여드리겠습니다.]]\n");
		
		for(int i=0;i<aniList.size();i++) {
			if(aniList.get(i)!=null)
				System.out.println(i+ ":" + aniList.get(i));
		}
		
		System.out.println("[[우리 동물들의 소리도 들려드리겠습니다.]]");
		for(int i=0;i<aniList.size();i++) {
			if(aniList.get(i)!=null)
				aniList.get(i).sound();
		}
		Member sana = new Member("사나", 15);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("분양을 원하는 아이의 숫자를 선택해 주세요. -> ");
		int sel = sc.nextInt();
		
		System.out.print("선택하신 "+aniList.get(sel)+ "는 ");
		if(sana.isAdopt(aniList.get(sel))) {
			System.out.println("분양 가능합니다.");
		}else {
			System.out.println("아쉽지만 분양하실 수 없는 나이입니다.");
		}
	
		sc.close();
	}

}
