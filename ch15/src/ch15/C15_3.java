package ch15;

import java.io.*;

import java.net.*;

//ʹ�� URLConnection ���Զ��������ȡ��Ϣ
public class C15_3 {
	public static void main(String[] args) {
		try {
//			String ur="https://blog.csdn.net/github_38851471";
			String ur="file:///D:/Programs/MyGitPlace/�������������--Java/ch15/src/ch15/C15_2.java";
			URL MyUrl = new URL(ur);
			String Str;
			URLConnection con=MyUrl.openConnection();
			InputStreamReader ins = new InputStreamReader(con.getInputStream());
			BufferedReader in = new BufferedReader(ins);
			while((Str=in.readLine())!=null) {
				System.out.println(Str);		//�� URL ����ȡ��Ϣ����ʾ
			}
			in.close();
		}
		catch(MalformedURLException mfURLe) {		//����URL���ܲ������쳣
			System.out.println("MalformedURLException: "+mfURLe);
		}
		catch(IOException ioe) {
			System.out.println("IOException: "+ioe);
		}
	}
}
