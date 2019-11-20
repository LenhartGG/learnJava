package ch15;

//UDP�������˳���

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

class UDPServerThread extends Thread{
	//�����������̵߳�������
	private DatagramPacket packet;
	private DatagramSocket socket;
	static final int sport=1777;
	UDPServerThread(){
		try {
			//��socket���ӵ����ص�һ���˿���
			socket=new DatagramSocket(sport);
			System.out.println("Listening on port:"+socket.getLocalPort());
		} 
		catch(Exception e) 
		{
			System.out.println("Error: "+e);
		}
	}
	public void run() {
		//�̵߳���Ҫ����
		if(socket==null) { return; }
		while(true) 
		{
			try {
				InetAddress address;	int cport;
				byte[] buf1=new byte[1000],buf2=new byte[1000];
				String s="Your packet is received";
				packet=new DatagramPacket(buf1, buf1.length);	//����һ���������ݵİ�
				socket.receive(packet);
				String s1=new String(packet.getData());
				System.out.println("Received from client:"+s1);	//��ӡ���ݱ�������
				address=packet.getAddress();
				cport=packet.getPort();							//������ݱ���Դ��ַ��˿�
				buf2=s.getBytes();
				packet=new DatagramPacket(buf2, buf2.length, address, cport);	//���ɷ��͵����ݱ�
				socket.send(packet); 							//�������ݱ����ͻ�
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
