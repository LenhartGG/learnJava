package c53;

class A2{
	int x=0, y=1;
//	A2(){
//		Printme();
//	}
	void Myp() {
		System.out.println("x = " + x + " y = " + y);
	}
	private void Printme() {
		System.out.println("x = " + x + " y = " + y);
	}
}

/**
 * @author hliu047
 * 成员方法的继承
 */
public class C5_8 extends A2 {
	public static void main(String[] args) {
		A2 p = new A2();
		p.Myp();
//		p.Printme();
	}
}
