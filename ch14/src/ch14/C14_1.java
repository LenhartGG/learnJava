package ch14;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;

//�����������ݵĶ�ȡ
public class C14_1 {
	public static void main(String[] args) {
		int count; byte b[]=new byte[256];
		String str;
		BufferedInputStream bis=new BufferedInputStream(System.in);	//���뻺����������
		DataInputStream in=new DataInputStream(bis);				//�ֽ����������
		try {
			if(in.markSupported())	//�жϵ�ǰ�������Ƿ�֧�� mark �� reset ���� 
			{
				System.out.println("֧��mark");
				System.out.print("�����ַ������� Enter ����  ");
				in.mark(256); 	//���������ĵ�ǰλ�������ñ�ǣ�������256λ
				count=in.read(b);	//��������������ݴ���b���飬count�õ�b����ĳ���
				System.out.println("�����ַ�����"+count);
				str=new String(b, 0, count);	//��b����ת��Ϊ�ַ���
				System.out.println("������ַ���Ϊ��"+str);
				in.reset();						//���»ص���Ǵ���ȡ����
				in.read(b,0,2);					//��ȡǰ�����ַ�
				str=new String(b,0,2);
				System.out.println("�ַ�����ǰ������"+str);
				in.reset();		in.skip(count/2);
				in.read(b,0,count/2);
				str=new String(b,0,count/2);
				System.out.println("�ַ����ĺ��Σ�"+str);
			}
			else
			{	System.out.println("��֧�� mark"); }
			bis.close();
			in.close();
		} 
		catch(IOException e) {
			System.out.println("����I/O����");
		}
	}
}
