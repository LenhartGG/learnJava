package ch15;

import java.io.*;
import java.net.*;

//Socket通信的客户端程序
public class C15_6 {
	public static void main(String[] args) {
		String str;
		try {
			InetAddress addr = InetAddress.getByName("127.0.0.1");
			Socket socket = new Socket(addr, 8000);
			System.out.println("Socket: "+socket);
			//获得对应的Socket输入/输出流
			InputStream fIn=socket.getInputStream();
			OutputStream fOut=socket.getOutputStream();
			//建立数据流
			InputStreamReader isr=new InputStreamReader(fIn);
			BufferedReader in=new BufferedReader(isr);
			PrintStream out=new PrintStream(fOut);
			InputStreamReader userisr=new InputStreamReader(System.in);
			BufferedReader userin=new BufferedReader(userisr);
			while(true) {
				System.out.print("发送字符串:");
				str=userin.readLine();						//读取用户输入的字符串
				out.println(str);							//将字符串传给服务器端
				if(str.equals("end")) { break; }			//如果是end，则退出
				System.out.println("等待服务器端消息···");
				str=in.readLine();							//获取服务器发送的字符串
				System.out.println("服务器端字符串:"+str);
				if(str.equals("end")) { break; }			//如果是end，则退出
			}
			socket.close();
			
		}
		catch(Exception e) {
			System.out.println("异常： "+e);
		}
	}
}
