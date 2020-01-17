package java_04_methods;

/**
 * @author hliu047
 * Java ʵ�� - Varargs �ɱ����ʹ��
 */
public class method_varargs {
	public static void main(String[] args) {
		int sum = 0;
		sum = sumvarargs(new int[] {10, 11, 12});
		System.out.println("�������֮���ǣ�"+sum);
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
