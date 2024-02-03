package reference;

import java.util.Calendar;

public class EnumEx01 {

	public static void main(String[] args) {
		Week today = null;
		
		// Calender 는 컴퓨터의 날짜를 불러온다.
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR) + "년");
		System.out.println(cal.get(Calendar.MONTH) + 1 +"월");
		System.out.println(cal.get(Calendar.DAY_OF_MONTH) + "일");//
		int weekday = cal.get(Calendar.DAY_OF_WEEK); // 요일을 숫자로 가지고 온다
		
		switch(weekday) {
		case 1:
			today = Week.SUNDAY;
			break;
		
		case 2:
			today = Week.TUESDAY;
			break;
		
		case 3:
			today = Week.WEDNEDAY;
			break;
		
		case 4:
			today = Week.MONDAY;
			break;
		
		case 5:
			today = Week.THURSDAY;
			break;
		
		case 6:
			today = Week.FRIDAY;
			break;
			
		case 7:
			today = Week.SATUDAY;
			break;
			
		}
		if(today == Week.SUNDAY) {
			System.out.println("휴일");
		} else {
			System.out.println("공부");
		}
		
		
	}

}
