package c54;

class A5{
	int x = 4, y = 1;
	public void Printme() {
		System.out.println("x="+x +"\ty="+y);
		System.out.println("class name: " + this.getClass().getName());
	}
}

public class C5_13 extends A5{
	int x;
	public void Printme() {
		int z = super.x + 6;	//���ø���A5�����ݳ�Ա
		super.Printme();		//���ø���A5�ĳ�Ա����
		System.out.println("I am class name: " + this.getClass().getName());
		x=5;
		System.out.println("z="+z+"\tx"+x);
	}
	public static void main(String[] args) {
		int k;
		A5 p1 = new A5();
		C5_13 p2 = new C5_13();
		p1.Printme();
		p2.Printme();
	}
}
