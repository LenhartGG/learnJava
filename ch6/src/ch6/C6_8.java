package ch6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//用冒泡排序法对8个数从小到大进行排序

class SortClass{			//类定义开始
	void sort(int arr[]) {	//开始定义冒泡排序方法 sort
		int i,k,temp;
		int len=arr.length;
		for(i=0; i<len-1; i++) {
			for(k=len-1; k>i; k--) {
				if(arr[k]<arr[k-1]) {
					temp=arr[k-1];
					arr[k-1]=arr[k];
					arr[k]=temp;
				}
			}
		}
	}
	
}

public class C6_8 {
	public static void main(String[] args)throws IOException {
		BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
		int i;
		String c1;
		int arr[] = new int[8];
		int len = arr.length;
		System.out.println(" 请从键盘输入8个整数，一行只输入一个数");
		for(i=0; i<len; i++) {
			c1=keyin.readLine();			//用于读取一个字符串
			arr[i]=Integer.parseInt(c1);	//将字符串类型c1转换成整数类型
		}
		//打印原始数据
		System.out.println("原始数据：");
		for(i=0; i<len; i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println("\n");
		SortClass p1 = new SortClass();
		p1.sort(arr);						//实参为数组名
		System.out.println("冒泡法排序的结果：");
		for(i=0; i<len; i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println("\n");
	}
}




