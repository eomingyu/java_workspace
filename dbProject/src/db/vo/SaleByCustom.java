package db.vo;

public class SaleByCustom {
//v_by custno view에 있는 4개의 컬럼과 매필될 필드 선언	
	private int custno;
	private String custname;
	private String agrade;
	private int asum;
	
	public SaleByCustom() {
		// TODO Auto-generated constructor stub
	}

	public SaleByCustom(int custno, String custname, String agrade, int asum) {
		super();
		this.custno = custno;
		this.custname = custname;
		this.agrade = agrade;
		this.asum = asum;
	}

	public int getCustno() {
		return custno;
	}

	public String getCustname() {
		return custname;
	}

	public String getAgrade() {
		return agrade;
	}

	public int getAsum() {
		return asum;
	}

	public void setCustno(int custno) {
		this.custno = custno;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public void setAgrade(String agrade) {
		this.agrade = agrade;
	}

	public void setAsum(int asum) {
		this.asum = asum;
	}

	@Override
	public String toString() {
		return String.format("%-10s%-10s%-5s\t%-10s"
				,custno,custname,agrade,asum);
	}

	
	
	
	
	
}	
