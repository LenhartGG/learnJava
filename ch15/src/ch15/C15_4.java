package ch15;

import java.io.*;

import java.net.*;

//����InetAddress��Ķ�������ȡ�����������Ϣ��
public class C15_4 {
	public static void main(String[] args) {
		try
		{
			if(args.length==1)
			{	//����InetAddress��ľ�̬������������������������
				InetAddress ipa=InetAddress.getByName(args[0]);
				System.out.println("Host name: "+ ipa.getHostName());		//��ȡ������
				System.out.println("Host IP Address: "+ ipa.toString());	//��ȡIP��ַ
				System.out.println("Local Host: "+ InetAddress.getLocalHost());
			}
			else
				System.out.println("����һ��������");
		}
		catch(UnknownHostException e) 
		{	System.out.println(e.toString());	}
	}//end of main
}
