package ch3;

public class C3_exercises {
	public static void test_3(int x) {
		int y = 0;
		if (x<1) {
			y = x;
		} else if (x<10) {
			y = 3 * x - 2;
		} else {
			y = 4 * x;
		}
		System.out.println(y);
//		return y + "12";
	}
	
	public static void test_6() {
		for (int k=1; k<=5; k++) {
			if(k>4) {
				break;
			}
			System.out.println("k=" + k);
		}
	}
	
	public static void test_7() {
		int sum = 0;
		for (int k=1; k<=10; k++) {
			sum += k * k;
			System.out.print("k = " + k + "	");
			System.out.println("sum = " + sum);
		}
	}
	
	public static void test_9(int a, int b, int c) {
		
		
	}
	
	/**
	 * 分别使用三种循环结构编写程序
	 */
	public static void test_10() {
		int sum = 0;
		
//		for (int i=1; i<=50; i++) {
//			sum += i;
//		}
		
//		int i=1;
//		while (i<=50) {
//			sum += i;
//			i++;
//		}
		
		int i=1;
		do {
			sum+=i;
			i++;
		} while(i<=50);
		
		System.out.println(sum);
	}
	
	public static void test_11() {
		
		int sum = 0;
		for (int i = 1; i<=20; i++) {
			double sub;
			sub = Math.pow(2, i) - 1;
			sum += sub;
			System.out.println("i = " + i + " sub = " + sub + " sum = " + sum);
		}
	}
	
	public static void test_12() {
		double sum = 0;
		
		for(double n=1; n<=100; n++) {
			double sub;
			sub = 1 / n;
			sum += sub; 
//			System.out.println(sub);
			System.out.println("n=" + (int)n + " sub=1/" +  (int)n + " sum=" + sum);
		}
	}
	
	public static void main(String[] args) {
//		test_3(12);
//		test_6();
//		test_7();
//		test_10();
//		test_11();
		test_12();
	}
}



