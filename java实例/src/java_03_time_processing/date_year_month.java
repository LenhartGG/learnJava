package java_03_time_processing;

import java.util.Calendar;

/**
 * @author hliu047
 * Java ʵ�� - ��ȡ��ݡ��·ݵ� 
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
		
		System.out.println("��ǰʱ�䣺"+cal.getTime());
		System.out.println("");
		System.out.println("���ڣ�"+day);
		System.out.println("�·ݣ�"+month);
		System.out.println("��ݣ�"+year);

		System.out.println("һ���еĵڼ��죺"+dow);
		System.out.println("һ���еĵڼ��죺"+dom);
		System.out.println("һ���еĵڼ��죺"+doy);
	}

}
