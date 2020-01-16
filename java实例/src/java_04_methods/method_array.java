package java_04_methods;

/**
 * @author hliu047
 * Java ʵ�� - �������Ԫ�� 
 */
public class method_array {
	public static void main(String[] args) {
		Integer[] integerArray = {1, 2, 3, 4, 5};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
		Character[] characterArray = {'H', 'E', 'l', 'l', 'o'};
		
		System.out.println("������������飺");
		printArray(integerArray);

		System.out.println("\n���˫���������飺");
		printArray(doubleArray);
		
		System.out.println("\n����ַ������飺");
		printArray(characterArray);
	}

	private static void printArray(Character[] characterArray) {
		for (Character element: characterArray) {
			System.out.printf("\t%s", element);
		}
	}

	private static void printArray(Double[] doubleArray) {
		for (Double element: doubleArray) {
			System.out.printf("\t%s", element);
		}
	}

	private static void printArray(Integer[] integerArray) {
		for (int i=0; i<integerArray.length; i++) {
			System.out.printf("\t%s", integerArray[i]);
		}
	}
	
	//���Բ���ѧϰ���ķ��ͣ���������飺
	public static <E> void printArray(E[] inputArray) {
		for (E element: inputArray) {
			System.out.printf("\t%s", element);
		}
	}
}
