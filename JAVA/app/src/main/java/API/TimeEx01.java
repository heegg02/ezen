package API;

import java.util.Calendar;
import java.util.TimeZone;

public class TimeEx01 {

	public static void main(String[] args) {
		TimeZone tz = TimeZone.getTimeZone("America/New_York");
		
		Calendar now = Calendar.getInstance(tz);
		System.out.println(now);
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		int ampm = now.get(Calendar.AM_PM);
		
		String ap;
		
		if(ampm == Calendar.AM) {
			ap = "오전";
		} else {
			ap = "오전";
		}
		
		System.out.println(year + "년 " + month + "월 " + day + "일");
		System.out.printf("현재 뉴욕의 날짜는 %d년 %d월 %d일", year, month, day);
		System.out.println();
		System.out.printf("현재 의 시간은 %s %d시간 %d분 %d초", ap, hour, minute, second);
		
	}

}