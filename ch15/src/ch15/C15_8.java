package ch15;

//UDP通信的客户端程序

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class C15_8 {
	public static void main(String[] args) {
		DatagramSocket socket;	//用于发送/接受 UDP
		DatagramPacket packet;	//用于保存 UDP 的内容
		InetAddress address;	int port;
		byte[] buf1=new byte[1000], buf2=new byte[1000];
		String s="Hello, server", s2;
		if(args.length<3) {
			System.out.println("输入本地端口号，服务器名，服务器端口号 ");
			System.exit(0);
		}
		try {
			socket=new DatagramSocket(Integer.parseInt(args[0]));
			address=InetAddress.getByName(args[1]);
			port=Integer.parseInt(args[2]); 	buf1=s.getBytes();
			packet=new DatagramPacket(buf1, buf1.length, address, port);
			socket.send(packet); 								//向服务器发送数据报packet
			packet=new DatagramPacket(buf2, buf2.length);		//生成接收的数据报packet
			socket.receive(packet); 							//接收服务器传来的数据报packet
			s2=new String(packet.getData());
			System.out.println("Received from server: "+s2); 	//打印packet内容
			socket.close();										//关闭Socket
		}
		catch(Exception e) {
			System.out.println("Error: "+e);
		}
		
	}
}
