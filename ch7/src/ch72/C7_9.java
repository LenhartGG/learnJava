package ch72;

/**
 * StringBuffer的append()方法
 * @author hliu047
 *	将参数转换为字符串添加到当前字符串的后面
 */
public class C7_9 {
	public static void main(String[] args) {
		Object x = "hello";
		String s = "good bye";
		char cc[] = {'a','b','c','d','e','f'};
		boolean b = false;
		char c = 'Z';
		long k = 12345678;
		int i = 7;
		float f = 2.5f;
		double d = 33.777;
		StringBuffer buf = new StringBuffer();
		buf.append(x); buf.append(' '); buf.append(s);
		buf.append(' '); buf.append(cc); buf.append(' ');
		buf.append(cc, 0, 3); buf.append(' '); buf.append(b);
		buf.append(' '); buf.append(c); buf.append(' ');
		buf.append(k); buf.append(' '); buf.append(i);
		buf.append(' '); buf.append(f); buf.append(' ');
		buf.append(d);
		System.out.println(buf);
	}

}
