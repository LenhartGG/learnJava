package ch14;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Date;

//��ȡ�ļ����ļ��������ȡ���С�����ԡ�
public class C14_5 {
	public static void main(String[] args) {
		String Path;
		InputStreamReader din=new InputStreamReader(System.in); //��������
		BufferedReader in=new BufferedReader(din);
		try {
			System.out.print("��������Ի����·����");
			Path=in.readLine();		//��ȡ����
			File f=new File(Path);
			System.out.println("");
			System.out.println("·����"+f.getParent());
			System.out.println("������"+f.getName());
			System.out.println("����·����"+f.getAbsolutePath());
			System.out.println("�ļ���С��"+f.length());
			System.out.println("�Ƿ�Ϊ�ļ���"+(f.isFile()?"��":"��"));
			System.out.println("�Ƿ�ΪĿ¼��"+(f.isDirectory()?"��":"��"));
			System.out.println("�Ƿ�Ϊ���أ�"+(f.isHidden()?"��":"��"));
			System.out.println("�Ƿ�ɶ�ȡ��"+(f.canRead()?"��":"��"));
			System.out.println("�Ƿ��д�룺"+(f.canWrite()?"��":"��"));
			System.out.println("����޸�ʱ�䣺"+new Date(f.lastModified()));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
