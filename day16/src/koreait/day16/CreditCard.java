package koreait.day16;

public abstract class CreditCard {
	//1. 필드
	protected String owner;	//소유자
	protected int limit;	//이용 한도
	protected int payTotal;	//결제 금액
	//2. 생성자
	public CreditCard(String owner) {
		this.owner = owner;
	}
	//3. getter
	public String getOwner() {
		return owner;
	}
	public int getLimit() {
		return limit;
	}
	public int getPayTotal() {
		return payTotal;
	}
	//4. 추상메소드 선언
	public abstract int upLimit(int plus);
	public abstract int pay(int money);
	
	
}
