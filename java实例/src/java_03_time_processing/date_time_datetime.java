package java_03_time_processing;

import java.text.SimpleDateFormat;
import java.util.Date;

public class date_time_datetime {
	public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat();// ��ʽ��ʱ�� 
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");// aΪam/pm�ı��  
        Date date = new Date();// ��ȡ��ǰʱ�� 
        System.out.println("����ʱ�䣺" + sdf.format(date)); // ����Ѿ���ʽ��������ʱ�䣨24Сʱ�ƣ�
	}

}
