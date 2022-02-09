package koerait.day17;

import java.util.ArrayList;
import java.util.List;

public class CompareTest2 {

	public static void main(String[] args) {
		//User 객체 5개 생성하여 list에 담아서 sort 해보세요.
		List<User> ulist = new ArrayList<>();
		ulist.add(new User("가나",30));
		ulist.add(new User("다나",18));
		ulist.add(new User("바나",25));
		ulist.add(new User("사나",22));
		ulist.add(new User("나나",20));
		
		System.out.println("sort 이전: "+ulist);
		ulist.sort(null);		//비교 가능
		System.out.println("sort 이후: "+ulist);
	}

}
//User 타입은 비교 가능한 객체입니다.
//Member타입은 비교 가능한 객체가 아닙니다. ->sort할 때 Comparator(비교자) 인자로 전달해야 합니다.