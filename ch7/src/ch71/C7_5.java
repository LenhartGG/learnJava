package ch71;

//将其他类型的数据转换成字符串
public class C7_5 {
	public static void main(String[] args) {
		double m1 = 3.456;
		String s1 = String.valueOf(m1);
		char[] cc = {'a', 'b', 'c'};
		String s2 = String.valueOf(cc);
		boolean f = true;
		String s3 = String.valueOf(f);
		char[] cs = {'j', 'a', 'v', 'a'};
		String s4 = String.valueOf(cs, 2, 2);
		
		System.out.println("m1="+m1+"\ts1="+s1);
		System.out.println("s2="+s2);
		System.out.println("f="+f+"\ts3="+s3);
		System.out.println("s4="+s4);
		
	}

}
