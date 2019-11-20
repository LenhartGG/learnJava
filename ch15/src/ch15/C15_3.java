package ch15;

import java.io.*;

import java.net.*;

//使用 URLConnection 类从远程主机获取信息
public class C15_3 {
	public static void main(String[] args) {
		try {
//			String ur="https://blog.csdn.net/github_38851471";
			String ur="file:///D:/Programs/MyGitPlace/面向对象程序设计--Java/ch15/src/ch15/C15_2.java";
			URL MyUrl = new URL(ur);
			String Str;
			URLConnection con=MyUrl.openConnection();
			InputStreamReader ins = new InputStreamReader(con.getInputStream());
			BufferedReader in = new BufferedReader(ins);
			while((Str=in.readLine())!=null) {
				System.out.println(Str);		//从 URL 处获取信息并显示
			}
			in.close();
		}
		catch(MalformedURLException mfURLe) {		//创建URL可能产生的异常
			System.out.println("MalformedURLException: "+mfURLe);
		}
		catch(IOException ioe) {
			System.out.println("IOException: "+ioe);
		}
	}
}
