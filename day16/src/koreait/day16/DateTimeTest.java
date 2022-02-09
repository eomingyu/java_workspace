package koreait.day16;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateTimeTest {

	//날짜와 시간 형식을 다루는 자바 클래스를 연습힙니다.
	//1)java.util.Date 클래스	2)java.util.Calender 클래스
	//3) java 8 버전 java.time.LocalDate(날짜), LocalTime(시간), LocalDateTime(날짜와 시간) 클래스
	public static void main(String[] args) {

		LocalDate currentDate = LocalDate.now();	
		System.out.println("날짜 확인 : "+ currentDate);
		
		LocalTime currentTime = LocalTime.now();
		System.out.println("시간 확인: "+ currentTime);
		
		LocalDateTime current = LocalDateTime.now();
		System.out.println("날짜와 시간 확인: "+ current);
		
		//임의 날짜 또는 시간으로 객체를 생성합니다.
		LocalDate mybirth = LocalDate.of(1999, 11, 11);
		System.out.println("내 생일 날짜 확인: "+mybirth);
		
		LocalTime mybirth_time = LocalTime.of(22, 22);
		System.out.println("내 탄생 시간 확인: "+mybirth_time);
				
		//현재 날짜로부터 5일 후를 계산
		int day = 5;
		System.out.println("오늘 날짜로부터 "+day+ "일 후는 "+currentDate.plusDays(day));
		day=30;
		System.out.println("오늘 날짜로부터 "+day+ "일 전은 "+currentDate.minusDays(day));
		
		//내가 태어난 지 며칠이 지났는지.(날짜 사이의 간격 계산)
		Period between = Period.between(mybirth, currentDate);
		System.out.println("내가 태어난 지 "+between.getYears()+"년");
		System.out.println("내가 태어난 지 "+between.getMonths()+"개월");
		System.out.println("내가 태어난 지 "+between.getDays()+"일");
		
		long test = ChronoUnit.DAYS.between(mybirth, currentDate);
		System.out.println("test = "+test);
		test = ChronoUnit.YEARS.between(mybirth, currentDate);
		System.out.println("test = "+test);
		
		//Duration 클래스  : 시간 간격 계산할 때 사용하는 메소드 있습니다.
		//ChronoUnit	: 시,분,초,일,월,주,일 단위로 모두 사용할 수 있는 메소드 있습니다.
		
	}

}
