package ch15;

import java.io.*;
import java.net.*;

//Socketͨ�ŵķ���˳���
public class C15_5 {
	public static final int port = 8000;
	public static void main(String[] args) {
		String str;
		try {
			//�ڶ˿�portע�����
			ServerSocket server = new ServerSocket(port);	//������ǰ�̵߳ļ�������
			System.out.println("Started: "+server);
			Socket socket = server.accept();				//����CSͨ�ŵ�Socket����
			System.out.println("Socket: "+socket);
			InputStream fIn = socket.getInputStream();
			OutputStream fOut = socket.getOutputStream();
			//����������
			InputStreamReader isr = new InputStreamReader(fIn);
			BufferedReader in = new BufferedReader(isr);
			PrintStream out = new PrintStream(fOut);
			InputStreamReader userisr = new InputStreamReader(System.in);
			BufferedReader userin = new BufferedReader(userisr);
			while(true) {
				System.out.println("�ȴ��ͻ��˵���Ϣ������");
				str = in.readLine();						//���ͻ��˴��͵��ַ���
				System.out.println("�ͻ���: "+str);			//��ʾ�ַ���
				if(str.equals("end")) { break; }			//�����end�����˳�
				System.out.print("���ͻ��˷���:");
				str = userin.readLine();	out.println(str); //��ͻ��˷�����Ϣ
				if(str.equals("end")) { break; }
			}
			socket.close();		server.close();
			
		}
		catch(Exception e) {
			System.out.println("�쳣: "+e);
		}
	}
}
