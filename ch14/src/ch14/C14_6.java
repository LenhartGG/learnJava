package ch14;

import java.io.*;
import java.util.*;

//显示文件夹的内容
public class C14_6 {
	public static void main(String[] args) {
		File ListFile[];
		long totalSize=0;
		int FileCount=0, DirectoryCount=0;
		File f=new File("C:\\N-5CG5343PNB-Data\\hliu047\\Desktop\\test");		//生成File对象
		System.out.println("目录："+f.getParent()+"\n");
		if(f.exists()!=true)			//若文件不存在，则结束程序 
		{
			System.out.println(f.getPath()+"不存在！");
			return;
		}
		if(f.isDirectory()) 			//若路径为目录
		{
			ListFile=f.listFiles();		//取得文件列表
			for(int i=0; i<ListFile.length; i++) {
				System.out.print( "\t"+(ListFile[i].isDirectory()?"D":"X") );
				System.out.print( "\t"+new Date(ListFile[i].lastModified()) );
				System.out.print( "\t"+ListFile[i].length() );
				System.out.print( "\t"+ListFile[i].getName()+"\n" );
				if(ListFile[i].isFile()) FileCount++;		//计算文件数
				else DirectoryCount++;						//计算目录数
				totalSize=totalSize+ListFile[i].length();	//计算文件总字节数
			}
			System.out.println("\n\t\t 目录数："+DirectoryCount);
			System.out.println("\t\t 文件数："+FileCount);
			System.out.println("\t\t 总字节数："+totalSize);
		}
		else							//若路径为文件时
		{
			System.out.print( "\t"+(f.isDirectory()?"D":"X") );
			System.out.print( "\t"+new Date(f.lastModified()) );
			System.out.print( "\t"+f.length() );
			System.out.print( "\t"+f.getName() );
			FileCount++;
			totalSize=totalSize+f.length();
			System.out.println("\n\t\t 目录数："+DirectoryCount);
			System.out.println("\t\t 文件数："+FileCount);
			System.out.println("\t\t 总字节数："+totalSize);
		}
	}

}
