package ch14;

import java.io.*;

//�����ļ�
public class C14_9 {

	public static void main(String[] args) {
		String temp;
		File sourceFile,targetFile;		//����File����
		BufferedReader source;
		BufferedWriter target;
		try {
			InputStreamReader din = new InputStreamReader(System.in);
			BufferedReader in = new BufferedReader(din);
			System.out.print("��������Դ�ļ�·��:");
			sourceFile = new File(in.readLine());
			source = new BufferedReader(new FileReader(sourceFile));
			System.out.print("������Ŀ���ļ�·��:");
			targetFile = new File(in.readLine());
			target = new BufferedWriter(new FileWriter(targetFile));
			System.out.print("ȷ��Ҫ��ֵ��(y/n)");
			if((in.readLine()).equals("y")) {
				while((temp=source.readLine())!=null) {
					target.write(temp);
					target.newLine();
					target.flush();
				}
				System.out.println("�����ļ���ɣ�");
			} 
			else {
				System.out.println("�����ļ�ʧ�ܣ�");
				return;
			}
			din.close();
			in.close();
		}
		catch(IOException e) {
			System.out.println("I/O ����");
		}
	}

}
