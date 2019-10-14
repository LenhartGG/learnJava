package ch72;

public class C7_8 {
	public static void main(String[] args) {
		StringBuffer buf1 = new StringBuffer();
		StringBuffer buf2 = new StringBuffer(10);
		StringBuffer buf3 = new StringBuffer("hello");
		//返回当前字符串长度
		int len1 = buf1.length();
		int len2 = buf2.length();
		int len3 = buf3.length();
		//返回当前缓冲区长度
		int le1 = buf1.capacity();
		int le2 = buf2.capacity();
		int le3 = buf3.capacity();
		//从buf3中区下标为3的字符
		char ch = buf3.charAt(3);
		//使用StringBuffer的toString()方法将三个StringBuffer对象转换成String对象输出
		System.out.println("buf1="+buf1.toString());
		System.out.println("buf2="+buf2.toString());
		System.out.println("buf3="+buf3.toString());
		System.out.println("len1="+len1+"\tlen2="+len2+"\tlen3="+len3);
		System.out.println("le1="+le1+"\tle2="+le2+"\tle3="+le3);
		System.out.println("ch="+ch);
	}

}
