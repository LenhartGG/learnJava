package ch15;

import java.io.*;
import java.net.*;

//Socketͨ�ŵĿͻ��˳���
public class C15_6 {
	public static void main(String[] args) {
		String str;
		try {
			InetAddress addr = InetAddress.getByName("127.0.0.1");
			Socket socket = new Socket(addr, 8000);
			System.out.println("Socket: "+socket);
			//��ö�Ӧ��Socket����/�����
			InputStream fIn=socket.getInputStream();
			OutputStream fOut=socket.getOutputStream();
			//����������
			InputStreamReader isr=new InputStreamReader(fIn);
			BufferedReader in=new BufferedReader(isr);
			PrintStream out=new PrintStream(fOut);
			InputStreamReader userisr=new InputStreamReader(System.in);
			BufferedReader userin=new BufferedReader(userisr);
			while(true) {
				System.out.print("�����ַ���:");
				str=userin.readLine();						//��ȡ�û�������ַ���
				out.println(str);							//���ַ���������������
				if(str.equals("end")) { break; }			//�����end�����˳�
				System.out.println("�ȴ�����������Ϣ������");
				str=in.readLine();							//��ȡ���������͵��ַ���
				System.out.println("���������ַ���:"+str);
				if(str.equals("end")) { break; }			//�����end�����˳�
			}
			socket.close();
			
		}
		catch(Exception e) {
			System.out.println("�쳣�� "+e);
		}
	}
}
