package date;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonalTimeEx {

	public static void main(String[] args) {
		
		Set set = ZoneId.getAvailableZoneIds();
//		
//		for(Object zones :set) {
//			
//			System.out.println(zones);
//		}
		
		ZoneId zone = ZoneId.of("America/New_York");
		
		ZonedDateTime  time = ZonedDateTime.now(zone);
		
		System.out.println(time);
	}
}
