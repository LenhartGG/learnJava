package java_04_methods;

/**
 * @author hliu047
 * Java ÊµÀý - ½×³Ë 
 */
public class method_factorial {
    public static void main(String[] args) {
    	for (int counter = 0; counter<=10; counter++) {
    		System.out.printf("%d! = %d\n", counter, factorial(counter));
    	}
    }

	private static int factorial(int number) {
		if(number==0) {
			return 1;
		} else {
			return number * factorial(number-1);
		}
	}
}
