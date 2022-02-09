package koreait.day16;

import java.text.DecimalFormat;

public class CurrentTimeTest {

	public static void main(String[] args) {
		
		System.out.println(System.currentTimeMillis());
		
		long start = System.currentTimeMillis();
		System.out.println("1일은"+24L*60L*60L*1000L+"ms 입니다.");
		System.out.println("1년은"+365L*24L*60L*60L*1000L+"ms 입니다.");
		
		DecimalFormat df = new DecimalFormat("###,###,###,###");
		long t1 = 24L*60L*60L*1000L;
		long t2 = 365L*24L*60L*60L*1000L;
		
		System.out.println("1일은 " +df.format(t1)+" ms 입니다.");
		System.out.println("1년은 " +df.format(t2)+" ms 입니다.");
	}

}
