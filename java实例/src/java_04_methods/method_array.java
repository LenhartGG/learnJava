package java_04_methods;

/**
 * @author hliu047
 * Java 实例 - 输出数组元素 
 */
public class method_array {
	public static void main(String[] args) {
		Integer[] integerArray = {1, 2, 3, 4, 5};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
		Character[] characterArray = {'H', 'E', 'l', 'l', 'o'};
		
		System.out.println("输出整数型数组：");
		printArray(integerArray);

		System.out.println("\n输出双精度型数组：");
		printArray(doubleArray);
		
		System.out.println("\n输出字符型数组：");
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
	
	//可以采用学习过的泛型，来输出数组：
	public static <E> void printArray(E[] inputArray) {
		for (E element: inputArray) {
			System.out.printf("\t%s", element);
		}
	}
}
