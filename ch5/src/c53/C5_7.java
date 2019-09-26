package c53;

class A11{
	int x = 8;
}

/**
 * @author hliu047
 * 数据成员的隐藏
 */
public class C5_7 extends A11{
	int x = 24;
	public static void main(String[] args) {
		int s1, s2;
		A11 p = new A11();
		C5_7 p2 = new C5_7();
		s1 = p.x;
		s2 = p2.x;
		System.out.println("s1 = " + s1 + "\t s2 = " + s2);
	}
}
