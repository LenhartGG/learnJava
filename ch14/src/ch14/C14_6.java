package ch14;

import java.io.*;
import java.util.*;

//��ʾ�ļ��е�����
public class C14_6 {
	public static void main(String[] args) {
		File ListFile[];
		long totalSize=0;
		int FileCount=0, DirectoryCount=0;
		File f=new File("C:\\N-5CG5343PNB-Data\\hliu047\\Desktop\\test");		//����File����
		System.out.println("Ŀ¼��"+f.getParent()+"\n");
		if(f.exists()!=true)			//���ļ������ڣ���������� 
		{
			System.out.println(f.getPath()+"�����ڣ�");
			return;
		}
		if(f.isDirectory()) 			//��·��ΪĿ¼
		{
			ListFile=f.listFiles();		//ȡ���ļ��б�
			for(int i=0; i<ListFile.length; i++) {
				System.out.print( "\t"+(ListFile[i].isDirectory()?"D":"X") );
				System.out.print( "\t"+new Date(ListFile[i].lastModified()) );
				System.out.print( "\t"+ListFile[i].length() );
				System.out.print( "\t"+ListFile[i].getName()+"\n" );
				if(ListFile[i].isFile()) FileCount++;		//�����ļ���
				else DirectoryCount++;						//����Ŀ¼��
				totalSize=totalSize+ListFile[i].length();	//�����ļ����ֽ���
			}
			System.out.println("\n\t\t Ŀ¼����"+DirectoryCount);
			System.out.println("\t\t �ļ�����"+FileCount);
			System.out.println("\t\t ���ֽ�����"+totalSize);
		}
		else							//��·��Ϊ�ļ�ʱ
		{
			System.out.print( "\t"+(f.isDirectory()?"D":"X") );
			System.out.print( "\t"+new Date(f.lastModified()) );
			System.out.print( "\t"+f.length() );
			System.out.print( "\t"+f.getName() );
			FileCount++;
			totalSize=totalSize+f.length();
			System.out.println("\n\t\t Ŀ¼����"+DirectoryCount);
			System.out.println("\t\t �ļ�����"+FileCount);
			System.out.println("\t\t ���ֽ�����"+totalSize);
		}
	}

}
