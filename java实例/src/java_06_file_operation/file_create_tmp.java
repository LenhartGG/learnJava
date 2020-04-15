package java_06_file_operation;

import java.io.*;
/**
 * @author hliu047
 * Java 实例 - 创建临时文件 
 */
public class file_create_tmp {
	public static void main(String[] args) {
		try {
			File temp = File.createTempFile("runtest", ".txt");
			System.out.println("文件路径："+temp.getAbsoluteFile());
			temp.deleteOnExit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
