package java_06_file_operation;

import java.io.*;
/**
 * @author hliu047
 * Java ʵ�� - ������ʱ�ļ� 
 */
public class file_create_tmp {
	public static void main(String[] args) {
		try {
			File temp = File.createTempFile("runtest", ".txt");
			System.out.println("�ļ�·����"+temp.getAbsoluteFile());
			temp.deleteOnExit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
