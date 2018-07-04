package commonLibs.utils;

import java.util.Date;

public class DateUtils {
	
	public static String getDate() {
		
		Date date = new Date();
		
		String timestamp = String.valueOf(date.getTime());
		
		return timestamp;
	}

}
