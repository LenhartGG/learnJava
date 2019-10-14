package ch71;

//字符串操作
//字符串的连接、替换和字母大小写转换操作
public class C7_4 {
	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "java";
		String s3 = "Welcome";
		String s4 = "Welcome";
		String s5 = "Welcoge";
		String sc1 = s3.concat(s1);
		String sc2 = s1.concat("abx");
		String sr1 = s3.replace('e', 'r');
		String w1 = s5.toLowerCase();
		String u2 = s2.toUpperCase();
		System.out.println("s1="+s1+"\t"+"s2="+s2);
		System.out.println("s3="+s3+"\t"+"s4="+s4);
		System.out.println("s5="+s5);
		System.out.println("s3+s1="+sc1);
		System.out.println("s1+abx="+sc2);
		System.out.println("s3.replace('e', 'r')="+sr1);
		System.out.println("s5.toLowerCase()="+w1);
		System.out.println("s2.toUpperCase()="+u2);
		
		
	}
}
