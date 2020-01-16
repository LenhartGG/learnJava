package java_04_methods;

/**
 * @author hliu047
 * Java 实例 - 斐波那契数列 
 */
public class method_fibonacci {
    public static void main(String[] args) {
    	for (int counter = 0; counter<=10; counter++) {
    		System.out.printf("Fibonacci of %d is: %d\n", counter, fibonacci(counter));
    	}
    }

	private static long fibonacci(int number) {
		if (number==0||number==1) {
			return number;
		} else {
			return fibonacci(number-1) + fibonacci(number-2);
		}
	}
}
