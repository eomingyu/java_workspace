package koreait.day16;

import java.text.DecimalFormat;

public class KakaoMini extends CreditCard {
	//상수
	static final int MAX_LIMIT = 100000;
	//생성자
	public KakaoMini(String owner) {
		super(owner);
	}
	//toString 재정의
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("###,###,### 원");
		return  owner + " 님. 이번달 결제예정금액 "+df.format(payTotal)+" 입니다."
				+ "\n[이용한도 "+df.format(limit)+"]";
	}
	//추상 메소드 구현
	public int upLimit(int plus) {	//이용한도 올리는 메소드
		if(limit+plus>MAX_LIMIT) 
			return 0;
		else {
			limit+=plus;
			return plus;
		}
	}
	public int pay(int money) {		//카드 사용하는 메소드.money 금액 결제
		if(money+payTotal>limit)
			return 0;
		else {
			payTotal+=money;
			return money;
		}
	}


}
