package java_03_time_processing;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author hliu047
 * Java ʵ�� - ʱ���ת����ʱ�� 
 * ����ʵ����ʾ�����ʹ�� SimpleDateFormat ��� format() ������ʱ���ת����ʱ�䡣 
 * ���ں�ʱ��ģʽ(ע���Сд������ĺ����ǲ�ͬ��)��
   	yyyy����
    MM����
    dd����
    hh��1~12Сʱ��(1-12)
    HH��24Сʱ��(0-23)
    mm����
    ss����
    S������
    E�����ڼ�
    D��һ���еĵڼ���
    F��һ���еĵڼ�������(���������ܹ�������������7)
    w��һ���еĵڼ�������
    W��һ���еĵڼ�����(�����ʵ���������)
    a���������ʶ
    k����HH��࣬��ʾһ��24Сʱ��(1-24)
    K����hh��࣬��ʾһ��12Сʱ��(0-11)
    z����ʾʱ�� 
 */
public class date_timestamp_to_date {
	public static void main(String[] args) {
		Long timeStamp = System.currentTimeMillis(); //��ȡ��ǰʱ���
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));      // ʱ���ת����ʱ��
        System.out.println("��ʽ�����1��" + sd);
        
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy �� MM �� dd �� HH ʱ mm �� ss ��");
        String sd2 = sdf2.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
        System.out.println("��ʽ�����2��" + sd2);
	}

}
