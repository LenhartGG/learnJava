package java_06_file_operation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class file_write {
	public static void main(String[] args) {
		//1.�Զ��巽����
		FileGet fg = new FileGet();
		fg.fileWriteRead();
		
		//2.˽�з���
		writeRead();
	}

	private static void writeRead() {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("helloworld.txt"));
			out.write("hello world, hello java.");
			out.close();
			System.out.println("�ļ������ɹ���");
			try {
				BufferedReader in = new BufferedReader(new FileReader("helloworld.txt"));
				String str;
				while((str = in.readLine()) != null) {
					System.out.println(str);
				}
				System.out.println(str);
			} catch(IOException e) {
				
			}
		} catch(IOException e) {
			
		}
	}
	
}

/**
 * @author hliu047
 *	���´����ǽ���ȡ�ļ���д���ļ�һ��д�ģ���ȡ�ļ�ʱ String ���� Stringbuffer ��ߴ��������ٶȣ�
 *	ready() �����ж��ļ��Ƿ�׼���ñ���ȡ�����Ϊ null����ֹͣ��ͬʱ����ȷ�� Stringbuffer ���ᱨ��ָ���쳣��
 */
class FileGet {
	
	public static void fileWriteRead() {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("runoob.txt"));
            out.write("����̳�");
            out.append("dasd");
            out.newLine();
            out.write("���");
            out.flush();
            out.close();
            System.out.println("�ļ������ɹ���");
            BufferedReader in = new BufferedReader(new FileReader("runoob.txt"));
            StringBuffer sb;
            while (in.ready()) {
                sb = (new StringBuffer(in.readLine()));
                System.out.println(sb);
            }
            in.close();
        } catch (IOException e) {
        }
	}
}
