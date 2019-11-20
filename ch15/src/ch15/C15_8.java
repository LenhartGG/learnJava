package ch15;

//UDPͨ�ŵĿͻ��˳���

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class C15_8 {
	public static void main(String[] args) {
		DatagramSocket socket;	//���ڷ���/���� UDP
		DatagramPacket packet;	//���ڱ��� UDP ������
		InetAddress address;	int port;
		byte[] buf1=new byte[1000], buf2=new byte[1000];
		String s="Hello, server", s2;
		if(args.length<3) {
			System.out.println("���뱾�ض˿ںţ������������������˿ں� ");
			System.exit(0);
		}
		try {
			socket=new DatagramSocket(Integer.parseInt(args[0]));
			address=InetAddress.getByName(args[1]);
			port=Integer.parseInt(args[2]); 	buf1=s.getBytes();
			packet=new DatagramPacket(buf1, buf1.length, address, port);
			socket.send(packet); 								//��������������ݱ�packet
			packet=new DatagramPacket(buf2, buf2.length);		//���ɽ��յ����ݱ�packet
			socket.receive(packet); 							//���շ��������������ݱ�packet
			s2=new String(packet.getData());
			System.out.println("Received from server: "+s2); 	//��ӡpacket����
			socket.close();										//�ر�Socket
		}
		catch(Exception e) {
			System.out.println("Error: "+e);
		}
		
	}
}
