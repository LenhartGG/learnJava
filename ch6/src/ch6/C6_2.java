package ch6;

//用数组求解 Fibonacci 数列的前20项，即使用数组下标表达式求解数学上的迭代问题
public class C6_2 {
	public static void main(String[] args) {
		int i;
		int f[]=new int[20];	//创建f数组，用于存储20个整型数据
		f[0]=1; f[1]=1;
		for(i=2; i<20; i++) {
			f[i]=f[i-2]+f[i-1];	//数组元素的下标使用循环变量
		}
		for(i=0; i<20; i++) {
			if(i%5==0)System.out.println("\n");
			System.out.print("\t"+f[i]);
		}
	}
}
