package java_06_file_operation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class file_write {
	public static void main(String[] args) {
		//1.自定义方法类
		FileGet fg = new FileGet();
		fg.fileWriteRead();
		
		//2.私有方法
		writeRead();
	}

	private static void writeRead() {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("helloworld.txt"));
			out.write("hello world, hello java.");
			out.close();
			System.out.println("文件创建成功。");
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
 *	以下代码是将读取文件与写入文件一起写的，读取文件时 String 换成 Stringbuffer 提高代码运行速度，
 *	ready() 方法判断文件是否准备好被读取，如果为 null，则停止。同时可以确保 Stringbuffer 不会报空指针异常。
 */
class FileGet {
	
	public static void fileWriteRead() {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("runoob.txt"));
            out.write("菜鸟教程");
            out.append("dasd");
            out.newLine();
            out.write("你好");
            out.flush();
            out.close();
            System.out.println("文件创建成功！");
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
