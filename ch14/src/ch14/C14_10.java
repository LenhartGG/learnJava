package ch14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

//�Ӽ�������������ֲ�д���ļ� temp\t2.txt �У��ٴ�����ļ����������ȡĳ������
//������ʾ����Ļ�ϣ�ͬʱ�����û���������޸ġ�
public class C14_10 {

	public static void main(String[] args) {
		int num, a;
		long fp;
		try {
			InputStreamReader din = new InputStreamReader(System.in);	//��������
			BufferedReader in = new BufferedReader(din);
			//���������ȡ�ļ�
			System.out.println("args="+args[0]);
			RandomAccessFile rf = new RandomAccessFile(args[0],"rw");
			System.out.println("���������������");
			int b[] = new int[5];
			for(int i=0; i<b.length; i++) {
				System.out.print("��"+(i+1)+"����");
				b[i] = Integer.parseInt(in.readLine());
				rf.writeInt(b[i]);//д���ļ�
			}
			while(true) {
				rf.seek(0); 		//�ƶ��ļ�ָ�뵽�ļ�ͷ
				System.out.print("������Ҫ��ʾ�ڼ��� ����1-5����");
				num=Integer.parseInt(in.readLine());	//�������
				num=num-1;
				fp=(num)*4;		//ÿ������4���ֽڣ������ƶ�λ��
				rf.seek(fp); 	//�ƶ��ļ�ָ�뵽Ҫ��ʾ������λ
				a=rf.readInt();
				System.out.println("��"+(num+1)+"������:"+a);
				System.out.println("��д����");
				b[num]=Integer.parseInt(in.readLine());
				fp=num*4;rf.seek(fp); 
				rf.writeInt(b[num]);	//д���ļ�
				System.out.println("������?(y/n)");
				if( (in.readLine()).equals("n") ) break;
			}
			rf.close();
		} 
		catch(IOException e) {
			e.printStackTrace();
//			System.out.println("I/O ����");
		}
	}

}
