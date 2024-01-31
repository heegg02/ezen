package API;

import java.util.TimeZone;

public class TimeZoneEx01 {

	public static void main(String[] args) {
		String[] tz = TimeZone.getAvailableIDs();
		for(int i=0; i<tz.length; i++) {
			System.out.println(tz[i]);
		}

	}

}
