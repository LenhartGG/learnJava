package ch4;

// ������ Fibonacci ���еĵ�8�
public class C4_15 {
	
	static int fibo(int n) {
		if(n==1) return 1;
		else if(n==2) return 1;
		else return (fibo(n-2) + fibo(n-1));
	}
	
	public static void main(String[] args) {
		int n = 8;
		int f8 = fibo(n);
		System.out.println(f8);
	}
}
