package db.day3;

import db.vo.Custom;

public class Day3Main {

	public static void main(String[] args) {
		Custom momo = CustomDao.selectOne("twice");
		System.out.println(momo);
		
		SingletonObj obj =SingletonObj.getInstance();
		obj.print();
		SingletonObj obj2 =SingletonObj.getInstance();
		System.out.println(obj==obj2);
		//Singleton 객체는 1개만 생성됩니다.
	}

}
