package java_03_time_processing;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date_time_am_pm {
	public static void main(String[] args) {
		Date date = new Date();
		String strDateFormat = "yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
		System.out.println(sdf.format(date));
	}

}
