package ch15;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

//ʹ�� URL ��� OpenStream() ��Ա������ȡ URL ָ����������Ϣ
public class C15_2 {
	public static void main(String[] args) {
		String Str;		InputStream st1;
		String ur="https://blog.csdn.net/github_38851471";
//		String ur="file:///D:/Programs/MyGitPlace/�������������--Java/ch15/src/ch15/C15_2.java";
		try {
			URL MyUrl = new URL(ur);
			st1=MyUrl.openStream();
			InputStreamReader ins = new InputStreamReader(st1);
			BufferedReader in = new BufferedReader(ins);
			while((Str=in.readLine())!=null) {
				System.out.println(Str);		//�� URL ����ȡ��Ϣ����ʾ
			}
		}
		catch(MalformedURLException e) {		//����URL���ܲ������쳣
			System.out.println("Can't get URL:");
		}
		catch(IOException e) {
			System.out.println("Error in I/O: "+e.getMessage());
		}
	}
}
