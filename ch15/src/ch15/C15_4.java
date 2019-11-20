package ch15;

import java.io.*;

import java.net.*;

//利用InetAddress类的对象来获取计算机主机信息。
public class C15_4 {
	public static void main(String[] args) {
		try
		{
			if(args.length==1)
			{	//调用InetAddress类的静态方法，利用主机名创建对象
				InetAddress ipa=InetAddress.getByName(args[0]);
				System.out.println("Host name: "+ ipa.getHostName());		//获取主机名
				System.out.println("Host IP Address: "+ ipa.toString());	//获取IP地址
				System.out.println("Local Host: "+ InetAddress.getLocalHost());
			}
			else
				System.out.println("输入一个主机名");
		}
		catch(UnknownHostException e) 
		{	System.out.println(e.toString());	}
	}//end of main
}
