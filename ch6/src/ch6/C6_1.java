package ch6;

/**
 * 	数组的声明、初始化和其长度的测定
 * @author hliu047
 *
 */
public class C6_1 {
	public static void main(String[] args) {
		int i;
		double a1[];
		char[] a2;
		a1=new double[8];
		a2=new char[8];
		int a3[]=new int[8];
		byte[] a4=new byte[8];
		char a5[]= {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
		//下面测定各数组的长度
		System.out.println("a1.length="+a1.length);
		System.out.println("a2.length="+a2.length);
		System.out.println("a3.length="+a3.length);
		System.out.println("a4.length="+a4.length);
		System.out.println("a5.length="+a5.length);
		//引用数组中的每一个元素，为各元素赋值
		for(i=0;i<8;i++) {
			a1[i]=100+i;
			a3[i]=i;
			a2[i]=(char)(i+97);		//显式强制类型转换，将整形数转换成字符型
		}
		//下面打印各数组元素
		System.out.println("\ta1\ta2\ta3\ta4\ta5");
		System.out.println("\tdouble\tchar\tint\tbyte\tchar");
		for(i=0;i<8;i++) {
			System.out.println("\t"+a1[i]+"\t"+a2[i]+"\t"+a3[i]+"\t"+a4[i]+"\t"+a5[i]);
		}
		
	}
}



