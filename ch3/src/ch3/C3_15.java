package ch3;

// 编程打印三角形数字图案
public class C3_15 {
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			for (int j=1; j<=11-i; j++) {
				System.out.print("  ");
			}
			
			for (int j=1; j<=i; j++) {
				if(i>=10) System.out.print(i + "  ");
				else System.out.print(i + "   ");
			}
			System.out.println("");
		}
	}
}
