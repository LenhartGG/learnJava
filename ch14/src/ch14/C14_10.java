package ch14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;

//从键盘输入五个数字并写入文件 temp\t2.txt 中，再从这个文件汇总随机读取某个数，
//将它显示在屏幕上，同时允许用户对其进行修改。
public class C14_10 {

	public static void main(String[] args) {
		int num, a;
		long fp;
		try {
			InputStreamReader din = new InputStreamReader(System.in);	//键盘输入
			BufferedReader in = new BufferedReader(din);
			//建立随机存取文件
			System.out.println("args="+args[0]);
			RandomAccessFile rf = new RandomAccessFile(args[0],"rw");
			System.out.println("请输入五个整数：");
			int b[] = new int[5];
			for(int i=0; i<b.length; i++) {
				System.out.print("第"+(i+1)+"个数");
				b[i] = Integer.parseInt(in.readLine());
				rf.writeInt(b[i]);//写入文件
			}
			while(true) {
				rf.seek(0); 		//移动文件指针到文件头
				System.out.print("请输入要显示第几个 数（1-5）：");
				num=Integer.parseInt(in.readLine());	//读入序号
				num=num-1;
				fp=(num)*4;		//每个整数4个字节，计算移动位数
				rf.seek(fp); 	//移动文件指针到要显示数的首位
				a=rf.readInt();
				System.out.println("第"+(num+1)+"个数是:"+a);
				System.out.println("改写此数");
				b[num]=Integer.parseInt(in.readLine());
				fp=num*4;rf.seek(fp); 
				rf.writeInt(b[num]);	//写入文件
				System.out.println("继续吗?(y/n)");
				if( (in.readLine()).equals("n") ) break;
			}
			rf.close();
		} 
		catch(IOException e) {
			e.printStackTrace();
//			System.out.println("I/O 错误");
		}
	}

}
