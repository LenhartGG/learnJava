package ch14;

import java.io.*;

//�Ӽ��̶����ַ���������Ļ���
public class C14_2 {
	public static void main(String[] args) {
		int count;
		byte b[]=new byte[256];
		BufferedInputStream in=new BufferedInputStream(System.in); //���뻺����������
		BufferedOutputStream bout=new BufferedOutputStream(System.out); //���������������
		DataOutputStream out=new DataOutputStream(bout);			//���������
		PrintStream p=new PrintStream(System.out);					//���������
		try {
			p.print("�������ַ�����");
			count=in.read(b);		//�Ӽ��̶������ݵ�b���飬count�õ�b�ĳ���
			in.close();
			p.println("�����ַ�����"+count);
			p.print("������ַ���Ϊ��");
			out.write(b, 0, count);	//��b�����0λ�ÿ�ʼ��count���ȵ��ֽ�д��out�Ķ�����
			bout.flush(); 			//���������������е������������Ļ��
			p.close();
			out.close();
		} catch(IOException e) {
			System.out.println("����I/O����");
		}
	}
}
