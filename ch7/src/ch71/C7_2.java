package ch71;

//String类的常用方法
public class C7_2 {
	public static void main(String[] args) {
		//String s1="Java Application";
		String s1=new String("Java Application");
		char cc[] = {'J','a','v','a',' ','A','p','p','l','i','c','a','t','i','o','n'};
		int len=cc.length;
		System.out.println(len);
		int len1 = s1.length();
		int len2 = "ABCD".length();
		char c1 = "12ABG".charAt(3);
		char c2 = s1.charAt(3);
		
		int n1 = "abj".indexOf(97);
		int n2 = s1.indexOf('J');
		int n3 = "abj".indexOf("bj",0);
		int n4 = s1.indexOf("va", 1);
		//返回当前串中的子串
		String s2 = "abcdefg".substring(4);
		String s3 = s1.substring(4, 9);	
	}
}
