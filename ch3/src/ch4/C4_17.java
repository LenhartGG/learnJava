package ch4;

class A1 {
	final int add(int x, int y) {	//��final���η����ε����շ���
		return (x + y);
	}
	int mul(int a, int b) {
		int z;
		z = add(1,7)+a*b;
		return z;
	}
}

/**
 * @author hliu047
 *
 */
public class C4_17 extends A1 {
	
	/*int add(int x, int y) {	//���� C4_17 ��ͼ���Ǹ��� A1 �� final ���������ǷǷ���
		return (x + y + 2);
	}*/
	
	public static void main(String[] args) {
		int a=2, b=3, z1, z2;
		C4_17 p1 = new C4_17();
		z1 = p1.add(a, b);		//����������ø����final����
		z2 = p1.mul(a, b);
		System.out.println("z1="+z1);
		System.out.println("z2="+z2);
	}
}
