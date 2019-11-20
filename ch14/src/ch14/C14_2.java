package ch14;

import java.io.*;

//从键盘读入字符串并由屏幕输出
public class C14_2 {
	public static void main(String[] args) {
		int count;
		byte b[]=new byte[256];
		BufferedInputStream in=new BufferedInputStream(System.in); //输入缓冲区流对象
		BufferedOutputStream bout=new BufferedOutputStream(System.out); //输出缓冲区流对象
		DataOutputStream out=new DataOutputStream(bout);			//输出流对象
		PrintStream p=new PrintStream(System.out);					//输出流对象
		try {
			p.print("请输入字符串：");
			count=in.read(b);		//从键盘读入数据到b数组，count得到b的长度
			in.close();
			p.println("读入字符数："+count);
			p.print("输入的字符串为：");
			out.write(b, 0, count);	//将b数组从0位置开始的count长度的字节写到out的对象中
			bout.flush(); 			//将缓冲流缓冲区中的数据输出到屏幕上
			p.close();
			out.close();
		} catch(IOException e) {
			System.out.println("发生I/O错误");
		}
	}
}
