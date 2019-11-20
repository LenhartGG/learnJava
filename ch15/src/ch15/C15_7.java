package ch15;

//UDP服务器端程序

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

class UDPServerThread extends Thread{
	//启动服务器线程的主程序
	private DatagramPacket packet;
	private DatagramSocket socket;
	static final int sport=1777;
	UDPServerThread(){
		try {
			//将socket连接到本地的一个端口上
			socket=new DatagramSocket(sport);
			System.out.println("Listening on port:"+socket.getLocalPort());
		} 
		catch(Exception e) 
		{
			System.out.println("Error: "+e);
		}
	}
	public void run() {
		//线程的主要操作
		if(socket==null) { return; }
		while(true) 
		{
			try {
				InetAddress address;	int cport;
				byte[] buf1=new byte[1000],buf2=new byte[1000];
				String s="Your packet is received";
				packet=new DatagramPacket(buf1, buf1.length);	//生成一个接受数据的包
				socket.receive(packet);
				String s1=new String(packet.getData());
				System.out.println("Received from client:"+s1);	//打印数据报的内容
				address=packet.getAddress();
				cport=packet.getPort();							//获得数据报的源地址与端口
				buf2=s.getBytes();
				packet=new DatagramPacket(buf2, buf2.length, address, cport);	//生成发送的数据报
				socket.send(packet); 							//发送数据报给客户
			}
			catch(Exception e) {
				System.out.println("Error: "+e);
			}
		}
	}
	protected void finalize() {
		if(socket!=null) {
			socket.close();
			System.out.println("Socket Closed.");
		}
	}
}

public class C15_7 {
	public static void main(String[] args) {
		UDPServerThread server=new UDPServerThread();
		server.start();
	}
}
