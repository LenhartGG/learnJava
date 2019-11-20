package ch14;

import java.io.*;

//复制文件
public class C14_9 {

	public static void main(String[] args) {
		String temp;
		File sourceFile,targetFile;		//创建File对象
		BufferedReader source;
		BufferedWriter target;
		try {
			InputStreamReader din = new InputStreamReader(System.in);
			BufferedReader in = new BufferedReader(din);
			System.out.print("请输入来源文件路径:");
			sourceFile = new File(in.readLine());
			source = new BufferedReader(new FileReader(sourceFile));
			System.out.print("请输入目的文件路径:");
			targetFile = new File(in.readLine());
			target = new BufferedWriter(new FileWriter(targetFile));
			System.out.print("确定要赋值？(y/n)");
			if((in.readLine()).equals("y")) {
				while((temp=source.readLine())!=null) {
					target.write(temp);
					target.newLine();
					target.flush();
				}
				System.out.println("复制文件完成！");
			} 
			else {
				System.out.println("复制文件失败！");
				return;
			}
			din.close();
			in.close();
		}
		catch(IOException e) {
			System.out.println("I/O 错误");
		}
	}

}
