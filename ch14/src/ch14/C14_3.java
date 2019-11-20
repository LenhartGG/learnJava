package ch14;

import java.io.*;

/**
 * 	������ PipedInputStream �� PipedOutputStream ʵ�ֹܵ�ͨ�ţ�
 * 	������ͨ�� ByteArrayInputStream �� ByteArrayOutputStream ʵ�ִ洢����/д��
 */
public class C14_3 {
	public static void main(String[] args) {
		byte a1=25,a2=67;
		byte b[]={'I','L','O','V','E',' ','J','A','V','A','!'};
		try {
			PipedInputStream pin=new PipedInputStream();
			PipedOutputStream pout=new PipedOutputStream(pin);	//����pin��pout������
			//���� ByteArrayInputStream ��� bin ���󣬲��� b �����
			ByteArrayInputStream bin=new ByteArrayInputStream(b);
			ByteArrayOutputStream bout=new ByteArrayOutputStream();
			System.out.println("PipedInputStream �� PipedOutputStream");
			System.out.println("\t ������ "+a1+"�͵� pout");
			pout.write(a1);
			System.out.println("\t ������ "+a2+"�͵� pout");
			pout.write(a2);
			System.out.println("\t �� pin �������� a1 "+ pin.read());
			System.out.println("\t �� pin �������� a2 "+ pin.read());
			int n=b.length;	//��ȡb����ĳ���
			bin.skip(n/2);	//ʹ��������ָ��λ���ֽ������м�λ�ã��������� b �±���м�λ�ö���
			int m;
			// �� bin �Ķ�������д�� ByteArrayOutputStream ��
			while(bin.available()>0) {	//�����������еĿɶ��ֽ�
				bout.write(bin.read());
			}
			System.out.print("��дһ������� ");
			bout.writeTo(System.out); //�������Ļ��
			bin.reset(); 			//�������ָ�뵽���Ŀ�ͷ
			bout.reset(); 			//��д����ָ�뵽���Ŀ�ͷ
			m=b.length;
			byte rb[]=new byte[m];
			bin.read(rb,0,10);
			bout.write(rb,0,10);
			System.out.println("\n �����д��������"+bout.toString());
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
