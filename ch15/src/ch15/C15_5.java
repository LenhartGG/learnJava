package ch15;

import java.io.*;
import java.net.*;

//Socket通信的服务端程序
public class C15_5 {
	public static final int port = 8000;
	public static void main(String[] args) {
		String str;
		try {
			//在端口port注册服务
			ServerSocket server = new ServerSocket(port);	//创建当前线程的监听对象
			System.out.println("Started: "+server);
			Socket socket = server.accept();				//负责CS通信的Socket对象
			System.out.println("Socket: "+socket);
			InputStream fIn = socket.getInputStream();
			OutputStream fOut = socket.getOutputStream();
			//建立数据流
			InputStreamReader isr = new InputStreamReader(fIn);
			BufferedReader in = new BufferedReader(isr);
			PrintStream out = new PrintStream(fOut);
			InputStreamReader userisr = new InputStreamReader(System.in);
			BufferedReader userin = new BufferedReader(userisr);
			while(true) {
				System.out.println("等待客户端的消息···");
				str = in.readLine();						//读客户端传送的字符串
				System.out.println("客户端: "+str);			//显示字符串
				if(str.equals("end")) { break; }			//如果是end，则退出
				System.out.print("给客户端发送:");
				str = userin.readLine();	out.println(str); //向客户端发送消息
				if(str.equals("end")) { break; }
			}
			socket.close();		server.close();
			
		}
		catch(Exception e) {
			System.out.println("异常: "+e);
		}
	}
}
