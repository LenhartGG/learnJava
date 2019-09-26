package c53;

class A3{
	int x = 10, y = 13;
	void Printme() {
		System.out.println("x=" + x + "\ty=" + y);
	}
}

/**
 * @author hliu047
 *	成员方法的覆盖
 */
public class C5_9 extends A3 {
	int z = 35;
	public void Printme() {
		System.out.println("z=" + z);
	}
	public static void main(String[] args) {
		A3 p = new A3();
		C5_9 p2 = new C5_9();
		p.Printme();
		p2.Printme();
	}
}
