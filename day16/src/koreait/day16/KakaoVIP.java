package koreait.day16;

import java.text.DecimalFormat;

public class KakaoVIP extends CreditCard{
	
	public static final int MAX_LIMIT = 20000000;   
	
	private int point;
	
	public KakaoVIP(String owner,int limit) {
		super(owner);
		this.limit=limit;
		System.out.println("고객님이 원하시는 한도 " + limit +"원으로 설정되었습니다.");
	}
	

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("###,###,### 원");
		return  owner + " 님. 이번달 결제예정금액 "+df.format(payTotal)+" 입니다."
				+ "\n[이용한도 "+df.format(limit)+", 포인트: "+point+ "]";
	}
	
	@Override
	public int upLimit(int plus) {
		limit +=plus;
		System.out.println("고객님은 제한없이 한도 조정 가능합니다.[" + limit + "원] 입니다.");
		return plus;
	}		
	
	@Override
	public int pay(int money) {
		payTotal+=money;
		if(payTotal>limit)		//추가 현재 이용 금액+money가 limit보다 크다면
			upLimit(5000000);		//자동으로 한도 5000000 증가	//limit+=5000000;
		this.point+=money*0.01;
		return money;
	}
}
