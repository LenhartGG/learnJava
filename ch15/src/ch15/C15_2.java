package ch15;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

//使用 URL 类的 OpenStream() 成员方法获取 URL 指定的网上信息
public class C15_2 {
	public static void main(String[] args) {
		String Str;		InputStream st1;
		String ur="https://blog.csdn.net/github_38851471";
//		String ur="file:///D:/Programs/MyGitPlace/面向对象程序设计--Java/ch15/src/ch15/C15_2.java";
		try {
			URL MyUrl = new URL(ur);
			st1=MyUrl.openStream();
			InputStreamReader ins = new InputStreamReader(st1);
			BufferedReader in = new BufferedReader(ins);
			while((Str=in.readLine())!=null) {
				System.out.println(Str);		//从 URL 处获取信息并显示
			}
		}
		catch(MalformedURLException e) {		//创建URL可能产生的异常
			System.out.println("Can't get URL:");
		}
		catch(IOException e) {
			System.out.println("Error in I/O: "+e.getMessage());
		}
	}
}
