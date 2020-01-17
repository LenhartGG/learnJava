package java_04_methods;

/**
 * @author hliu047
 * Java ʵ�� - ����(overloading)������ʹ�� Varargs 
 */
public class method_varargs2 {
	public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest("����: ", 10, 20);
        vaTest(true, false, false);
	}

	private static void vaTest(int ... no) {
		System.out.print("����������"+no.length+"�������ݣ�");
		for(int n: no) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
	private static void vaTest(String msg, int ... no) {
		System.out.print("����������"+no.length+"�������ݣ�");
		for(int n: no) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
	private static void vaTest(boolean ... bl) {
		System.out.print("����������"+bl.length+"�������ݣ�");
		for(boolean n: bl) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
	
}
