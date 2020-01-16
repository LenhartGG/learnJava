package java_03_time_processing;

import java.util.Calendar;

/**
 * @author hliu047
 * Java 实例 - 获取年份、月份等 
 */
public class date_year_month {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int day = cal.get(Calendar.DATE);
		int month = cal.get(Calendar.MONTH) + 1;
		int year = cal.get(Calendar.YEAR);
		int dow = cal.get(Calendar.DAY_OF_WEEK);
		int dom = cal.get(Calendar.DAY_OF_MONTH);
		int doy = cal.get(Calendar.DAY_OF_YEAR);
		
		System.out.println("当前时间："+cal.getTime());
		System.out.println("");
		System.out.println("日期："+day);
		System.out.println("月份："+month);
		System.out.println("年份："+year);

		System.out.println("一周中的第几天："+dow);
		System.out.println("一月中的第几天："+dom);
		System.out.println("一年中的第几天："+doy);
	}

}
