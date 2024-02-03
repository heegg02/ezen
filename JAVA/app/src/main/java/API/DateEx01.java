package API;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx01 {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		SimpleDateFormat now2;
		now2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(now2.format(now));
		
		now2 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(now2.format(now));

		now2 = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(now2.format(now));

		now2 = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss E요일");
		System.out.println(now2.format(now));
		
		now2 = new SimpleDateFormat("yyyy년 D번째 날입니다.");
		System.out.println(now2.format(now));
		
		now2 = new SimpleDateFormat("이번주는 MM월 W번째 주입니다.");
		System.out.println(now2.format(now));
		
		now2 = new SimpleDateFormat("이번주는 yyyy년의 w번째 주입니다.");
		System.out.println(now2.format(now));
		
		
		
	}

}
