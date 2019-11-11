package ch13;

import java.util.Calendar;

/**
 *	  用Thread类的子类创建两个线程对象
 * @author hliu047
 *
 */
public class C13_1 extends Thread{
	int pauseTime;
	String name;
	public C13_1(int hTime, String hStr) {
		pauseTime = hTime;
		name = hStr;
	}
	public void run() {
		Calendar now;
		int year, month, date, hour, minute, second;
		for(int i=0; i<10; i++) {
			try {
				now=Calendar.getInstance();		//取系统时间
				year=now.get(Calendar.YEAR);
				month=now.get(Calendar.MONTH);
				date=now.get(Calendar.DATE);
				hour=now.get(Calendar.HOUR_OF_DAY);
				minute=now.get(Calendar.MINUTE);
				second=now.get(Calendar.SECOND);
				System.out.println(" "+name+"时间："+year+"年"+month+"月"+date+"日"+hour+"时"+minute+"分"+second+"秒");
				Thread.sleep(pauseTime);
			} catch(Exception e) {
				System.out.println("线程错误： "+e);
			}
		}
	}
	
	public static void main(String[] args) {
		C13_1 myThread1 = new C13_1(2000, "线程A");
		myThread1.start();
		C13_1 myThread2 = new C13_1(1000, "线程B");
		myThread2.start();
	}
}
