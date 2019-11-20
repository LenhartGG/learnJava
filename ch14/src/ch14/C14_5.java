package ch14;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.Date;

//获取文件的文件名、长度、大小等特性。
public class C14_5 {
	public static void main(String[] args) {
		String Path;
		InputStreamReader din=new InputStreamReader(System.in); //键盘输入
		BufferedReader in=new BufferedReader(din);
		try {
			System.out.print("请输入相对或绝对路径：");
			Path=in.readLine();		//读取输入
			File f=new File(Path);
			System.out.println("");
			System.out.println("路径："+f.getParent());
			System.out.println("档案："+f.getName());
			System.out.println("绝对路径："+f.getAbsolutePath());
			System.out.println("文件大小："+f.length());
			System.out.println("是否为文件："+(f.isFile()?"是":"否"));
			System.out.println("是否为目录："+(f.isDirectory()?"是":"否"));
			System.out.println("是否为隐藏："+(f.isHidden()?"是":"否"));
			System.out.println("是否可读取："+(f.canRead()?"是":"否"));
			System.out.println("是否可写入："+(f.canWrite()?"是":"否"));
			System.out.println("最后修改时间："+new Date(f.lastModified()));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
