package java_04_methods;

/**
 * @author hliu047
 * Java 实例 - 重载(overloading)方法中使用 Varargs 
 */
public class method_varargs2 {
	public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest("测试: ", 10, 20);
        vaTest(true, false, false);
	}

	private static void vaTest(int ... no) {
		System.out.print("参数个数："+no.length+"参数内容：");
		for(int n: no) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
	private static void vaTest(String msg, int ... no) {
		System.out.print("参数个数："+no.length+"参数内容：");
		for(int n: no) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
	private static void vaTest(boolean ... bl) {
		System.out.print("参数个数："+bl.length+"参数内容：");
		for(boolean n: bl) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
	
}
