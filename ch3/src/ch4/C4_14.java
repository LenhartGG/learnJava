package ch4;

//��̼���4!��ֵ��
public class C4_14 {
	static int fac(int n) {
		int fa;
		if(n==0) {
			fa = 1;
		} else {
			fa = n*fac(n-1);
		}
		return fa;
	}
	
	public static void main(String[] args) {
		int n = 4;
		int f1 = fac(n);
		System.out.println(f1);
	}
}
