package java_04_methods;

/**
 * @author hliu047
 * Java 实例 - Varargs 可变参数使用
 */
public class method_varargs {
	public static void main(String[] args) {
		int sum = 0;
		sum = sumvarargs(new int[] {10, 11, 12});
		System.out.println("数字相加之和是："+sum);
	}

	private static int sumvarargs(int... intArrays) {
		int sum = 0;
		int i = 0;
		for(; i < intArrays.length; i++)
		{
			sum+=intArrays[i];
		}
		
		return sum;
	}
}
