package ch14;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;

//键盘输入数据的读取
public class C14_1 {
	public static void main(String[] args) {
		int count; byte b[]=new byte[256];
		String str;
		BufferedInputStream bis=new BufferedInputStream(System.in);	//输入缓冲区流对象
		DataInputStream in=new DataInputStream(bis);				//字节流输入对象
		try {
			if(in.markSupported())	//判断当前输入流是否支持 mark 和 reset 方法 
			{
				System.out.println("支持mark");
				System.out.print("输入字符串，按 Enter 结束  ");
				in.mark(256); 	//在输入流的当前位置上设置标记，并保留256位
				count=in.read(b);	//读键盘输入的数据存入b数组，count得到b数组的长度
				System.out.println("读入字符数："+count);
				str=new String(b, 0, count);	//将b数组转换为字符串
				System.out.println("输入的字符串为："+str);
				in.reset();						//重新回到标记处读取数据
				in.read(b,0,2);					//读取前两个字符
				str=new String(b,0,2);
				System.out.println("字符串的前两个："+str);
				in.reset();		in.skip(count/2);
				in.read(b,0,count/2);
				str=new String(b,0,count/2);
				System.out.println("字符串的后半段："+str);
			}
			else
			{	System.out.println("不支持 mark"); }
			bis.close();
			in.close();
		} 
		catch(IOException e) {
			System.out.println("发生I/O错误！");
		}
	}
}
