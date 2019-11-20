package ch15;

import java.net.MalformedURLException;
import java.net.URL;

//��ȡĳ�� URL ��ַ��Э���������������˿ںź��ļ�����
public class C15_1 {
	public static void main(String[] args) {
		URL MyUrl=null;
		try {
			MyUrl=new URL("https://blog.csdn.net/github_38851471");
		} catch(MalformedURLException e) {
			e.printStackTrace();
		}
		System.out.println("URL String:"+MyUrl.toString());
		System.out.println("Protocol:"+MyUrl.getProtocol());
		System.out.println("Host:"+MyUrl.getHost());
		System.out.println("Port:"+MyUrl.getPort());
		System.out.println("File:"+MyUrl.getFile());
	}
}
