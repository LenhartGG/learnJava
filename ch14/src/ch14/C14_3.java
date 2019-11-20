package ch14;

import java.io.*;

/**
 * 	利用流 PipedInputStream 和 PipedOutputStream 实现管道通信，
 * 	利用流通信 ByteArrayInputStream 与 ByteArrayOutputStream 实现存储器读/写。
 */
public class C14_3 {
	public static void main(String[] args) {
		byte a1=25,a2=67;
		byte b[]={'I','L','O','V','E',' ','J','A','V','A','!'};
		try {
			PipedInputStream pin=new PipedInputStream();
			PipedOutputStream pout=new PipedOutputStream(pin);	//建立pin与pout的连接
			//创建 ByteArrayInputStream 类的 bin 对象，并与 b 数组绑定
			ByteArrayInputStream bin=new ByteArrayInputStream(b);
			ByteArrayOutputStream bout=new ByteArrayOutputStream();
			System.out.println("PipedInputStream 和 PipedOutputStream");
			System.out.println("\t 将数据 "+a1+"送到 pout");
			pout.write(a1);
			System.out.println("\t 将数据 "+a2+"送到 pout");
			pout.write(a2);
			System.out.println("\t 由 pin 读入数据 a1 "+ pin.read());
			System.out.println("\t 由 pin 读入数据 a2 "+ pin.read());
			int n=b.length;	//获取b数组的长度
			bin.skip(n/2);	//使读操作的指针位于字节流的中间位置，即从数组 b 下标的中间位置读起
			int m;
			// 将 bin 的对象数据写入 ByteArrayOutputStream 中
			while(bin.available()>0) {	//返回输入流中的可读字节
				bout.write(bin.read());
			}
			System.out.print("读写一半的数据 ");
			bout.writeTo(System.out); //输出到屏幕上
			bin.reset(); 			//设读操作指针到流的开头
			bout.reset(); 			//设写操作指针到流的开头
			m=b.length;
			byte rb[]=new byte[m];
			bin.read(rb,0,10);
			bout.write(rb,0,10);
			System.out.println("\n 输出读写所有数据"+bout.toString());
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
